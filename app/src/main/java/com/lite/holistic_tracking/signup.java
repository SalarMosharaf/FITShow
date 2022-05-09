package com.lite.holistic_tracking;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public void run() {
                signup.this.finish();
                signup.this.startActivity(new Intent(signup.this, holistic_activity.class));
            }
        }, 4000);
    }
}
