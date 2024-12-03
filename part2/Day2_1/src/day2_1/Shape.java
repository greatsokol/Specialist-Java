package day2_1;

import java.awt.Color;

public abstract class Shape {

    protected int x, y;
    private final Color color;

    public Color getColor() {
        return color;
    }
    
    public Shape(int x, int y) {
        this(x, y, Color.ORANGE);
    }

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape move(int dx, int dy) {
        x += dx;
        y += dy;
        return this;
    }
    
    public abstract double area();
}
