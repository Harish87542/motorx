package com.example.login1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.login1.utils.NetworkConnection;

public class home extends AppCompatActivity implements NetworkConnection.ConnectivityReceiverListener{

    ImageView out;
    LinearLayout h_neton;
    LinearLayout h_netoff;
    NetworkConnection networkConnection;
    IntentFilter intentFilter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        h_neton=findViewById(R.id.h_neton);
        h_netoff=findViewById(R.id.h_netoff);
        out=findViewById(R.id.logout);
        networkConnection=new NetworkConnection();
        intentFilter=new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);

        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(home.this,login.class);
                startActivity(a);
                finish();
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
            h_netoff.setVisibility(View.GONE);
            h_neton.setVisibility(View.VISIBLE);}
        else{
            h_netoff.setVisibility(View.VISIBLE);
            h_neton.setVisibility(View.GONE);

        }
    }
}