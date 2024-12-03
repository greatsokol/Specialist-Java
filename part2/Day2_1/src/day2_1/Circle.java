package day2_1;

import java.awt.Color;

public class Circle extends Shape {
    private int r;

    public Circle(int r, int x, int y) {
        super(x, y);
        this.r = r;
    }

    public Circle(int r, int x, int y, Color color) {
        super(x, y, color);
        this.r = r;
    }

    @Override
    public double area() {
        return (double) r * r * Math.PI;
    }

    public void print() {
        System.out.printf(
                "x=%d, y=%d, r=%d, color=%s, area=%f\n",
                x, y, r, getColor(), area()
        );
    }    
}
