package com.company;

import java.awt.*;

//Класс "Одноугольник", реализующий интерфейс фигуры.
class Point implements Figure{
    private R2Point p;

    public Point(R2Point p){
        this.p = p;
    }


    public void pointsaround() {
        R2Point[] df = new R2Point[1];
        df[0] = p;
        PointsAroundSq.distance(df);
    }

    public double perimeter(){
        return 0.0;
    }

    public double area(){
        return 0.0;
    }

    public Figure add(R2Point q){
        if(!R2Point.equal(p, q))
            return new Segment(p, q);
        else
            return this;
    }

    public void draw(Graphics g){
        MyWindow.drawPoint(g, p);
    }
}