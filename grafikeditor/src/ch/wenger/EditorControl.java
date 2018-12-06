package ch.wenger;

import java.awt.Graphics;
import java.awt.Point;

public class EditorControl {
    private Drawing drawing;
    private char figurTyp;
    private Point ersterPunkt;

    public void allesNeuZeichnen(Graphics g) {
        //TODO: Erg�nzen
    }

    public void setFigurTyp(char figurTyp) {
        this.figurTyp = figurTyp;
    }

    public void setErsterPunkt(Point ersterPunkt) {
        this.ersterPunkt = ersterPunkt;
    }

    public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
        //TODO: Erg�nzen
    }

    public void setDrawing(Drawing drawing) {
        this.drawing = drawing;
    }
}
