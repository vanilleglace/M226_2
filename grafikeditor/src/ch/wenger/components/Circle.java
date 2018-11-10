package ch.wenger.components;

import ch.wenger.Shape;

import java.awt.*;

public class Circle extends Shape {
    int radius;

    public Circle(int startX, int startY, int radius, Color fillColor, Color strokeColor, int strokeWidth) {
        super(startX, startY, fillColor, strokeColor, strokeWidth);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
