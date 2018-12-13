package ch.wenger;


import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

@SuppressWarnings("serial")
final class EditorPanel extends JPanel {
    private EditorControl editorControl;
    public boolean isDrawing = false;

    EditorPanel(EditorControl control) {
        editorControl = control;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                isDrawing = true;
                System.out.println(e.getPoint());
                editorControl.setFirstPoint(e.getPoint());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                isDrawing = false;
            }
        });
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println(e.getPoint());
                if (isDrawing) {
                    editorControl.generateShapeSecondPoint(e.getPoint());
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        editorControl.drawAll((Graphics2D) g);
    }
}