package ch.wenger.components;

import ch.wenger.Shape;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape {
    public Rectangle() {

    }

    public Rectangle(double startX, double startY, double width, double height, Color fillColor, Color strokeColor, int strokeWidth) {
        super(startX, startY, width, height, fillColor, strokeColor, strokeWidth);
    }

    @Override
    public void draw(Graphics2D g2) {
        Rectangle2D rectangle = new Rectangle2D.Double(this.getStartX(), this.getStartY(), this.getWidth(), this.getHeight());
        g2.setColor(this.getFillColor());
        g2.fill(rectangle);
        g2.setColor(this.getStrokeColor());
        Stroke stroke = new BasicStroke(this.getStrokeWidth());
        g2.setStroke(stroke);
        g2.draw(rectangle);
    }
}
