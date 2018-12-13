package ch.wenger.components;

import ch.wenger.Shape;

import java.awt.*;
import java.awt.geom.Line2D;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Line extends Shape {
    double endX;
    double endY;

    public Line() {

    }

    public Line(double startX, double startY, double endX, double endY, Color fillColor, Color strokeColor, int strokeWidth) {
        super(startX, startY, fillColor, strokeColor, strokeWidth);
        this.endX = endX;
        this.endY = endY;
    }

    public double getEndX() {
        return endX;
    }

    public double getEndY() {
        return endY;
    }

    @Override
    public void draw(Graphics2D g2) {
        Line2D line = new Line2D.Double(this.getStartX(), this.getStartY(), endX, endY);
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
