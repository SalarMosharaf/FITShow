package com.lite.holistic_tracking;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;

public class signin extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public void run() {
                signin.this.finish();
                signin.this.startActivity(new Intent(signin.this, signup.class));
            }
        }, 4000);
    }
}
