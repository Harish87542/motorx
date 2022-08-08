package com.example.login1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.example.login1.utils.NetworkConnection;

public class splash extends AppCompatActivity implements NetworkConnection.ConnectivityReceiverListener {
    NetworkConnection networkConnection;
    IntentFilter intentFilter;
    LinearLayout neton;
    LinearLayout netoff;
    private Context context;
    private Object NetworkConnection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        context=splash.this;
        networkConnection=new NetworkConnection();
        intentFilter=new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        neton=findViewById(R.id.neton);
        netoff=findViewById(R.id.netoff);
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
              callInternet(isConnected);}

        private void callInternet(boolean isConnected){

            Log.e("internet check", String.valueOf(isConnected));
            if(isConnected) {
                netoff.setVisibility(View.GONE);
                neton.setVisibility(View.VISIBLE);


                Handler handler = new Handler();
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Intent intent = new Intent(splash.this, login.class);
                        startActivity(intent);
                        finish();

                    }
                }, 3000);
            }

            else{
                netoff.setVisibility(View.VISIBLE);
                neton.setVisibility(View.GONE);

            }
    }
}