package com.vhdrjb.dynamicgradient;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView cardview = findViewById(R.id.cardView);
        DynamicGradient dynamicGradient = new DynamicGradient();
        Drawable background = dynamicGradient.generateDynamicGradient("#836DC0", 36, GradientDrawable.Orientation.BL_TR);
        cardview.setBackgroundDrawable(background);
    }
}
