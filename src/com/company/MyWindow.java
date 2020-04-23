package com.company;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    public static final int WIDTHWIN = 600;
    public static final int HEIGHTWIN = 600;
    public static final int DIAMETER_OF_POINT = 2;
    private Convex convex;


    public MyWindow(Convex convex){
        this.convex = convex;
        this.setTitle("Coronavirus");
        this.setSize(WIDTHWIN, HEIGHTWIN);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }



    @Override
    public void paint(Graphics g){
        g.translate(300,300);
        g.drawLine(-300, 0, 300, 0);
        g.drawLine(0, -300, 0, 300);

        convex.draw(g);
    }

    public static void drawPoint(Graphics g, R2Point point){
        g.fillOval((int) point.getX(), (int) point.getY(), MyWindow.DIAMETER_OF_POINT, MyWindow.DIAMETER_OF_POINT);
    }

    public static void drawLine(Graphics g, R2Point f, R2Point s){
        g.drawLine((int) f.getX(), (int) f.getY(), (int) s.getX(), (int) s.getY());
    }

    public static Color getRandomColor(){
        return new Color((int)(Math.random() * 1000) % 256, (int)(Math.random() * 1000) % 256,
                (int)(Math.random() * 1000) % 256);
    }
}