package ch.wenger;

public class Grafikeditor {
    private static final EditorControl editorControl = new EditorControl();

    public static void main(String[] args) {
        new Grafikeditor();
    }

    private Grafikeditor() {
        EditorFrame editorFrame = new EditorFrame(800, 600);
    }
}
