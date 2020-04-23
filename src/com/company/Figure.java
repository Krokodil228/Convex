package com.company;

import java.awt.*;

//Интерфейс, задающий новый тип - фигуру.
interface Figure{
    public void pointsaround() throws CloneNotSupportedException;
    public double perimeter();
    public double area();
    public Figure add(R2Point p);
    public void draw(Graphics g);

}