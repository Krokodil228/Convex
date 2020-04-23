package com.company;

public class PointsAroundSq {
    public static void distance(R2Point[] array){
        int count = 0;
        R2Point k = new R2Point(1,0);
        R2Point l = new R2Point(0,0);
        R2Point m = new R2Point(0, 1);
        R2Point o = new R2Point(1, 1);

        for (R2Point s:array) {
            if(s==null) continue;

            if (R2Point.dist(s, k) <= 1 | R2Point.dist(s, l) <= 1 | R2Point.dist(s, m) <= 1 | R2Point.dist(s, o) <= 1) {
                count++;
                continue;
            }
            else if(s(k,l,s)){
                count++;
                continue;
            }
            else if(s(k,o,s)){
                count++;
                continue;
            }
            else if(s(l,m,s)){
                count++;
                continue;
            }
            else if(s(m,o,s)){
                count++;
                continue;
            }
        }
        System.out.println("Колво точек выпуклой оболочки расстояние которых меньше 1 =" + count);
    }
    public static boolean s(R2Point sq1, R2Point sq2, R2Point s){
        double r1 = R2Point.dist(sq1, s);
        double r2 = R2Point.dist(sq2, s);
        if(r1<Math.sqrt(2) && r2<Math.sqrt(2)){
            double k1 = Math.sqrt(r1*r1-1);
            double k2 = Math.sqrt(r2*r2-1);
            if(k1+k2<=1){
                return true;
            }

        }
        return false;
    }
}
