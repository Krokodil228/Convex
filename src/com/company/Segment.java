package com.company;

import java.awt.*;

//Класс "Двуугольник", реализующий интерфейс фигуры.
class Segment implements Figure {
    private R2Point p, q;

    public Segment(R2Point p, R2Point q) {
        this.p = p;
        this.q = q;
    }


    public void pointsaround() {
        R2Point[] df = new R2Point[2];
        df[0] = p;
        df[1] = q;
        PointsAroundSq.distance(df);
    }

    public double perimeter() {
        return 2.0 * R2Point.dist(p, q);
    }

    public double area() {
        return 0.0;
    }

    public Figure add(R2Point r) {
        if (R2Point.isTriangle(p, q, r))
            return new Polygon(p, q, r);

        if (q.inside(p, r))
            q = r;

        if (p.inside(r, q))
            p = r;

        return this;
    }

    public void draw(Graphics g) {
        MyWindow.drawPoint(g, p);
        MyWindow.drawPoint(g, q);
        MyWindow.drawLine(g, p, q);
    }
}