package ch.wenger;

import ch.wenger.components.Circle;
import ch.wenger.components.Line;
import ch.wenger.components.Rectangle;

import java.awt.*;

public class EditorControl {
    private static final Drawing drawing = new Drawing();
    private char shapeType = 'r';
    private Point firstPoint;

    public void drawAll(Graphics2D g2) {
        drawing.drawShapes(g2);
    }

    public void setShapeType(char shapeType) {
        this.shapeType = shapeType;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void generateShapeSecondPoint(Point secondPoint, boolean isDrawing) {
        double startX = Math.min(firstPoint.getX(), secondPoint.getX());
        double width = (Math.max(firstPoint.getX(), secondPoint.getX())) - startX;
        double startY = Math.min(firstPoint.getY(), secondPoint.getY());
        double height = (Math.max(firstPoint.getY(), secondPoint.getY())) - startY;
        Shape shape = null;
        switch (this.shapeType) {
            case 'r':
                shape = new Rectangle(startX, startY, width, height, Color.BLACK, Color.GRAY, 5);
                break;
            case 'l':
                shape = new Line(firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY(), Color.BLACK, Color.GRAY, 5);
                break;
            case 'k':
                shape = new Circle(startX, startY, width, Color.BLACK, Color.GRAY, 5);
                break;
        }

        drawing.addShape(shape);
    }
}
