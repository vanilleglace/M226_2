package ch.wenger;

import java.awt.*;
import java.io.*;

public abstract class Shape implements Serializable {
    private double startX;
    private double startY;
    private double width;
    private double height;
    private Color fillColor;
    private Color strokeColor;
    private int strokeWidth;

    public Shape() {

    }

    public Shape(double startX, double startY, Color fillColor, Color strokeColor, int strokeWidth) {
        this(startX, startY, 0, 0, fillColor, strokeColor, strokeWidth);
    }

    public Shape(double startX, double startY, double width, double height, Color fillColor, Color strokeColor, int strokeWidth) {
        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }

    public double getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public double getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public Color getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(Color strokeColor) {
        this.strokeColor = strokeColor;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public abstract void draw(Graphics2D g2);

    public void move(int x, int y) {
        this.startX += x;
        this.startY += y;
    }
}