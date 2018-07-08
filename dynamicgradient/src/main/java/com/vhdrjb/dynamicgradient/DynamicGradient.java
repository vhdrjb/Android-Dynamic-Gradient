package com.vhdrjb.dynamicgradient;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class DynamicGradient {
    public Drawable generateDynamicGradient(String color, int endColorDiffer, GradientDrawable.Orientation orientation) {

        return new GradientDrawable(orientation, getGradientColors(color, endColorDiffer));
    }

    private int[] getGradientColors(String colorSource, int endColorDiffer) {
        int color = Color.parseColor(colorSource);

        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);

        int[] endGradientColor = {generateEndGradientColor(red, endColorDiffer), generateEndGradientColor(green, endColorDiffer), generateEndGradientColor(blue, endColorDiffer)};
        int[] startGradientColor = {red, green, blue};
        return new int[]{getColor(startGradientColor), getColor(endGradientColor)};
    }

    private int getColor(int[] colorSource) {
        return Color.rgb(colorSource[ColorState.RED.getColor()], colorSource[ColorState.GREEN.getColor()], colorSource[ColorState.BLUE.getColor()]);
    }

    private int generateEndGradientColor(int color, int reduce) {
        return Math.max(0, Math.abs(color - reduce));
    }


}
