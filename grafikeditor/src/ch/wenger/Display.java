package ch.wenger;

import ch.wenger.components.*;
import ch.wenger.components.Rectangle;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JFrame {
    private List<Shape> shapes = new ArrayList<Shape>();

    public Display() {
        Dimension windowSize = new Dimension(800, 600);
        setSize(windowSize);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int windowPositionX = (screenSize.width - windowSize.width) / 2;
        int windowPositionY = (screenSize.height - windowSize.height) / 2;
        Point windowPosition = new Point(windowPositionX, windowPositionY);
        setLocation(windowPosition);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createAndAddDrawingPanel();
        setVisible(true);
    }

    private void createAndAddDrawingPanel() {
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                paintComponent((Graphics2D) g);
            }

            protected void paintComponent(Graphics2D g2) {
                drawShapes(g2);
            }
        });
    }

    private void drawShapes(Graphics2D g2) {
        for (Shape shape : shapes) {
            int startX = shape.getStartX();
            int startY = shape.getStartY();
            int width = shape.getWidth();
            int height = shape.getHeight();

            if (shape instanceof Rectangle) {
                Rectangle2D rectangle = new Rectangle2D.Double(startX, startY, width, height);
                g2.setColor(shape.getFillColor());
                g2.fill(rectangle);
                g2.setColor(shape.getStrokeColor());
                Stroke stroke = new BasicStroke(shape.getStrokeWidth());
                g2.setStroke(stroke);
                g2.draw(rectangle);
            }
            if (shape instanceof Line) {
                int length = ((Line) shape).getLength();
                Line2D line = new Line2D.Double(startX, startY, startX + length, startY + length);
                g2.setColor(shape.getFillColor());
                g2.fill(line);
                g2.setColor(shape.getStrokeColor());
                Stroke stroke = new BasicStroke(shape.getStrokeWidth());
                g2.setStroke(stroke);
                g2.draw(line);
            }
            if (shape instanceof Circle) {
                int radius = ((Circle) shape).getRadius();
                Ellipse2D ellipse = new Ellipse2D.Double(startX, startY, radius, radius);
                g2.setColor(shape.getFillColor());
                g2.fill(ellipse);
                g2.setColor(shape.getStrokeColor());
                Stroke stroke = new BasicStroke(shape.getStrokeWidth());
                g2.setStroke(stroke);
                g2.draw(ellipse);
            }
            if (shape instanceof Ellipse) {
                Ellipse2D ellipse = new Ellipse2D.Double(startX, startY, width, height);
                g2.setColor(shape.getFillColor());
                g2.fill(ellipse);
                g2.setColor(shape.getStrokeColor());
                Stroke stroke = new BasicStroke(shape.getStrokeWidth());
                g2.setStroke(stroke);
                g2.draw(ellipse);
            }
        }
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
        repaint();
    }

    public void clearDisplay() {
        shapes.clear();
        repaint();
    }
}