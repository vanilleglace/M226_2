package ch.wenger;

import ch.wenger.components.*;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Die Klasse Display stellt ein Fenster auf dem Bildschirm zur Verfügung, in welchem
 * Shape-Objekte dargestellt werden können.
 * Siehe auch Java-Grundkurs Abschnitt 10.2 und 10.3.
 *
 * @author Andres Scheidegger
 */
@SuppressWarnings("serial")
public class Display extends JFrame {
    /**
     * Die Liste der dargestellten Shape-Objekte
     */
    private List<Shape> shapes = new ArrayList<Shape>();

    /**
     * Konstruktor. Initialisiert das Fenster in der Mitte des Bildschirms und erzeugt ein
     * JFrame-Objekt, auf welchem die Figuren gezeichnet werden.
     */
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
        // Das JPanel-Objekt ist ein Objekt einer anonymen Unterklasse von JPanel
        // Siehe Java-Grundkurs Abschnitt 3.9
        add(new JPanel() {
            // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
            // Methode beim Dsiplay aufruft.
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawShapes(g);
            }
        });
    }

    private void drawShapes(Graphics g) {
        for (Shape shape : shapes) {
            int startX = shape.getStartX();
            int startY = shape.getStartY();
            int endX = shape.getEndX();
            int endY = shape.getEndY();

            if (shape instanceof Rectangle) {
                int width = endX- startX;
                int height = endY - startY;
                g.drawRect(startX, startY, width, height);
            }
            if (shape instanceof Line) {
                g.drawLine(startX, startY, endX, endY);
            }
            if (shape instanceof Circle || shape instanceof Ellipse) {
                int width = endX- startX;
                int height = endY - startY;
                g.drawOval(startX, startY, width, height);
            }
        }
    }

    /**
     * Fügt eine weitere Shape hinzu und löst die Auffrischung des Fensterinhaltes aus.
     *
     * @param shape Referenz auf das weitere Shape-Objekt.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
        repaint();
    }

    /**
     * Löscht alle Figuren und löst die Auffrischung des Fensterinhaltes aus.
     */
    public void clearDisplay() {
        shapes.clear();
        repaint();
    }
}