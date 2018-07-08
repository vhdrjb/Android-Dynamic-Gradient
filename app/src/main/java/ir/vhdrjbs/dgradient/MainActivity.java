package ir.vhdrjbs.dgradient;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

import ir.vhdrjbs.dynamicgradient.DynamicGradient;

public class MainActivity extends AppCompatActivity {
    private final static String[] colors = {"#CFBDF7"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView = findViewById(R.id.cardView);
        DynamicGradient dynamicGradient = new DynamicGradient();
        Drawable drawable = dynamicGradient.generateDynamicGradient("#CFBDF7", 30, GradientDrawable.Orientation.BL_TR);
        cardView.setBackgroundDrawable(drawable);
    }


}
