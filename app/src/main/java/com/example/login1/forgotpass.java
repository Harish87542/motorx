package com.example.login1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.login1.utils.NetworkConnection;

public class forgotpass extends AppCompatActivity implements NetworkConnection.ConnectivityReceiverListener {

    NetworkConnection networkConnection;
    IntentFilter intentFilter;
    LinearLayout fp_neton;
    LinearLayout fp_netoff;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpass);

        fp_neton = findViewById(R.id.fp_neton);
        fp_netoff = findViewById(R.id.fp_netoff);
        networkConnection=new NetworkConnection();
        intentFilter=new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        context=forgotpass.this;
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
            fp_netoff.setVisibility(View.GONE);
            fp_neton.setVisibility(View.VISIBLE);}

        else{
            fp_netoff.setVisibility(View.VISIBLE);
            fp_neton.setVisibility(View.GONE);

        }

    }
    }

