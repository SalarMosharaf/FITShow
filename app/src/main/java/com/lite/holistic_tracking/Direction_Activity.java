package com.lite.holistic_tracking;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;

public class Direction_Activity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public void run() {
                Direction_Activity.this.finish();
                Direction_Activity.this.startActivity(new Intent(Direction_Activity.this, signin.class));
            }
        }, 4000);
    }
}
