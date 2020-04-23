package com.company;

import java.awt.*;

//Класс "Выпуклая оболочка".
class Convex{
    public Figure fig;

    public Convex(){
        fig = new Void();
    }

    public void add(R2Point p){

        fig = fig.add(p);
    }

    public double area(){
        return fig.area();
    }

    public double perimeter(){
        return fig.perimeter();
    }

    public void draw(Graphics g){
        fig.draw(g);
    }
    public void pointsaround() throws CloneNotSupportedException {
        fig.pointsaround();
    }

}