package ch.wenger.components;

import ch.wenger.Shape;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ellipse extends Shape {
    public Ellipse() {

    }

    public Ellipse(int startX, int startY, int width, int height, Color fillColor, Color strokeColor, int strokeWidth) {
        super(startX, startY, width, height, fillColor, strokeColor, strokeWidth);
    }

    @Override
    public void draw(Graphics2D g2) {
        Ellipse2D ellipse = new Ellipse2D.Double(this.getStartX(), this.getStartY(), this.getWidth(), this.getHeight());
        g2.setColor(this.getFillColor());
        g2.fill(ellipse);
        g2.setColor(this.getStrokeColor());
        Stroke stroke = new BasicStroke(this.getStrokeWidth());
        g2.setStroke(stroke);
        g2.draw(ellipse);
    }
}
