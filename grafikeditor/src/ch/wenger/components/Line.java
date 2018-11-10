package ch.wenger.components;

import ch.wenger.Shape;

import java.awt.*;

public class Line extends Shape {
    int length;

    public Line(int startX, int startY, int length, Color fillColor, Color strokeColor, int strokeWidth) {
        super(startX, startY, fillColor, strokeColor, strokeWidth);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
