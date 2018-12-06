package ch.wenger.components;

import ch.wenger.Shape;

import java.awt.*;
import java.awt.geom.Line2D;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Line extends Shape {
    int endX;
    int endY;

    public Line() {

    }

    public Line(int startX, int startY, int endX, int endY, Color fillColor, Color strokeColor, int strokeWidth) {
        super(startX, startY, fillColor, strokeColor, strokeWidth);
        this.endX = endX;
        this.endY = endY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

    @Override
    public void draw(Graphics2D g2) {
        Line2D line = new Line2D.Double(this.getStartX(), this.getStartY(), endX, this.getStartY() + endY);
        g2.setColor(this.getFillColor());
        g2.fill(line);
        g2.setColor(this.getStrokeColor());
        Stroke stroke = new BasicStroke(this.getStrokeWidth());
        g2.setStroke(stroke);
        g2.draw(line);
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
        this.endX += x;
        this.endY += y;
    }
}
