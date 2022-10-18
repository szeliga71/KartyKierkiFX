package com.example.kartyszalonefx.Elements;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Frame {

    private Point2D rog;
    public double width, height;
    public double x;
    public double y;
    //protected double frameX,frameY;

    Image image;
    //protected  Image imageFront;
    //protected static Image back;

    public Frame(double width, double height) {
        this.width = width;
        this.height = height;
        //rog = new Point2D(x, y);

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public void draw(GraphicsContext gc) {
        //gc.drawImage(image,frameX, frameY, width, height, x, y, width, height);
        gc.drawImage(image, x, y, width, height);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean containsPoint(double x, double y,double mouseX,double mouseY) {

        boolean contains = false;


        for (int i = (int) x; i < x + width; i++) {
            for (int j = (int) y; j < y + height; j++) {

                if(i== (int)mouseX && j==(int)mouseY)
                    contains=true;
            }
        }

            return contains;}



}