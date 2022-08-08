package com.example.login1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.login1.utils.NetworkConnection;

public class login extends AppCompatActivity implements NetworkConnection.ConnectivityReceiverListener {
    NetworkConnection networkConnection;
    IntentFilter intentFilter;
    LinearLayout l_neton;
    LinearLayout l_netoff;
    private Context context;
    private Object NetworkConnection;
    EditText edit1;
    EditText edit2;
    Button login;
    TextView signup;
    TextView fp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);
        fp = findViewById(R.id.fp);
        l_neton = findViewById(R.id.l_neton);
        l_netoff = findViewById(R.id.l_netoff);
        networkConnection=new NetworkConnection();
        intentFilter=new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        context=login.this;


        fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(login.this, forgotpass.class);
                startActivity(a);

            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edit1.getText().toString().trim().equalsIgnoreCase("") &&
                        !edit2.getText().toString().trim().equalsIgnoreCase("")) {
                    Intent a = new Intent(login.this, home.class);
                    startActivity(a);

                } else
                    Toast.makeText(login.this, "login error", Toast.LENGTH_SHORT).show();
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(login.this, signup.class);
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
        public void onNetworkConnectionChanged(boolean isConnected){

        callInternet(isConnected);
        }

        private void callInternet ( boolean isConnected){

            Log.e("internet check", String.valueOf(isConnected));
            if (isConnected) {
                l_netoff.setVisibility(View.GONE);
                l_neton.setVisibility(View.VISIBLE);}

                else{
                    l_netoff.setVisibility(View.VISIBLE);
                    l_neton.setVisibility(View.GONE);

                }

            }
        }


