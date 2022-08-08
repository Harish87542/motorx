package com.example.login1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.login1.utils.NetworkConnection;

public class signup extends AppCompatActivity implements NetworkConnection.ConnectivityReceiverListener{

  Button create;
  TextView log1;
  NetworkConnection networkConnection;
  IntentFilter intentFilter;
  LinearLayout sign_neton;
  LinearLayout sign_netoff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        create=findViewById(R.id.create);
        log1=findViewById(R.id.log1);
        sign_neton = findViewById(R.id.sign_neton);
        sign_netoff = findViewById(R.id.sign_netoff);
        networkConnection=new NetworkConnection();
        intentFilter=new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(signup.this, "Acoount Created", Toast.LENGTH_SHORT).show();
            }
        });
        log1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signup.this, login.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = registerReceiver(networkConnection, intentFilter);
        networkConnection.setConnectivityReceiverListener(this);
        boolean isConnected = com.example.login1.utils.NetworkConnection.isConnected(this);
    }


    @Override
    public void onNetworkConnectionChanged(boolean isConnected) {
        callInternet(isConnected);
    }

    private void callInternet(boolean isConnected) {
        if (isConnected) {
            sign_netoff.setVisibility(View.GONE);
            sign_neton.setVisibility(View.VISIBLE);}

        else{
            sign_netoff.setVisibility(View.VISIBLE);
            sign_neton.setVisibility(View.GONE);

        }
    }
}