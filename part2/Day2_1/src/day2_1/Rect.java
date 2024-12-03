package day2_1;

import java.awt.Color;

public sealed class Rect extends Shape permits RectChildFinal, RectChildNonSealed {

    private int a, b;

    public Rect(int a, int b, int x, int y) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    public Rect(int a, int b, int x, int y, Color color) {
        super(x, y, color);
        this.a = a;
        this.b = b;
    }

    @Override
    public final double area() {
        return (double) a * b;
    }

    public void print() {
        System.out.printf(
                "x=%d, y=%d, a=%d, b=%d, color=%s, area=%f\n",
                x, y, a, b, getColor(), area()
        );
    }
}
