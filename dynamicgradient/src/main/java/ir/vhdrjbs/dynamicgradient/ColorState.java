package ir.vhdrjbs.dynamicgradient;

public enum ColorState {
    RED(0),BLUE(2),GREEN(1);
    int color;
    ColorState(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
