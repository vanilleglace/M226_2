package ch.wenger.components;

import ch.wenger.Shape;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape {
    int radius;

    public Circle(){

    }

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

    @Override
    public void draw(Graphics2D g2) {
        Ellipse2D ellipse = new Ellipse2D.Double(this.getStartX(), this.getStartY(), radius, radius);
        g2.setColor(this.getFillColor());
        g2.fill(ellipse);
        g2.setColor(this.getStrokeColor());
        Stroke stroke = new BasicStroke(this.getStrokeWidth());
        g2.setStroke(stroke);
        g2.draw(ellipse);
    }
}
