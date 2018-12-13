package ch.wenger;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
final class EditorFrame extends JFrame {
    private EditorControl editorControl = new EditorControl();

    public EditorFrame(int width, int height) {
        setEditorPanel();
        centerWindow(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                editorControl.setShapeType(e.getKeyChar());
            }
        });
    }

    private void setEditorPanel() {
        JPanel panel = new EditorPanel(editorControl);
        setContentPane(panel);
    }

    private void centerWindow(int width, int height) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle windowView = new Rectangle();
        windowView.width = width;
        windowView.height = height;
        windowView.x = (screenSize.width - windowView.width) / 2;
        windowView.y = (screenSize.height - windowView.height) / 2;
        setBounds(windowView);
    }
}
