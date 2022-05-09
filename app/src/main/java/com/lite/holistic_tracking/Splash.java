package com.lite.holistic_tracking;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;

public class Splash extends AppCompatActivity {
    ImageView img_fitshow;
    LottieAnimationView lottieAnimationView;
    TextView txt1_welcome;
    TextView txt2_to;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        this.lottieAnimationView = (LottieAnimationView) findViewById(R.id.lottie);
        this.txt1_welcome = (TextView) findViewById(R.id.splash_txt1);
        this.txt2_to = (TextView) findViewById(R.id.splash_txt2);
        this.img_fitshow = (ImageView) findViewById(R.id.splash_txt3);
        this.txt1_welcome.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anim1));
        this.txt2_to.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anim2));
        this.img_fitshow.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anim3));
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public void run() {
                Splash.this.finish();
                Splash.this.startActivity(new Intent(Splash.this, Direction_Activity.class));
            }
        }, 4000);
    }
}
