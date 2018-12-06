package ch.wenger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JFrame {
    private List<Shape> shapes = new ArrayList<Shape>();
    private Drawing drawing;

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
                if (drawing != null) {
                    drawing.drawShapes(g2);
                }
            }
        });
    }

    public void saveDisplay() {
        Writer writer = null;
        try {
            writer = new FileWriter("output.json");
            Gson gson= new GsonBuilder().create();
            gson.toJson(shapes, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}