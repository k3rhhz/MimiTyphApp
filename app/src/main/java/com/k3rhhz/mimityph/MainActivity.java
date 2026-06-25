package com.k3rhhz.mimityph;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    LinearLayout mainScreen, revealScreen;
    Button btnSurprise;
    ImageButton btnBack;
    ImageView imageMimi;
    TextView textShe, textSheSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainScreen = findViewById(R.id.mainScreen);
        revealScreen = findViewById(R.id.revealScreen);
        btnSurprise = findViewById(R.id.btnSurprise);
        btnBack = findViewById(R.id.btnBack);
        imageMimi = findViewById(R.id.imageMimi);
        textShe = findViewById(R.id.textShe);
        textSheSub = findViewById(R.id.textSheSub);

        btnSurprise.setOnClickListener(v -> {
            mainScreen.setVisibility(View.GONE);
            revealScreen.setVisibility(View.VISIBLE);
            revealScreen.setAlpha(0f);
            revealScreen.animate().alpha(1f).setDuration(1200).start();
            textShe.setVisibility(View.VISIBLE);
            textShe.animate().alpha(1f).setStartDelay(800).setDuration(1000).start();
            textSheSub.setVisibility(View.VISIBLE);
            textSheSub.animate().alpha(1f).setStartDelay(1000).setDuration(1000).start();
        });

        btnBack.setOnClickListener(v -> {
            revealScreen.setVisibility(View.GONE);
            mainScreen.setVisibility(View.VISIBLE);
            mainScreen.setAlpha(0f);
            mainScreen.animate().alpha(1f).setDuration(600).start();
            textShe.setAlpha(0f);
            textSheSub.setAlpha(0f);
        });
    }
}
