package com.company;


//Тест для выпуклой оболочки.
class ConvexTest{

    public static void main(String[] args) throws Exception{
        Convex convex = new Convex();
        MyWindow window = new MyWindow(convex);

        while(true){
            convex.add(new R2Point());
            window.update(window.getGraphics());
            System.out.println("S = " + convex.area()+ ", P = " + convex.perimeter());
            convex.pointsaround();

        }
    }
}