package ru.job4j.condition;

public class Point {


    public static void distance(int x1, int y1, int x2, int y2) {

        //Math.pow(a, b)
        double rsl = Math.sqrt( Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.println("result ("+x1+", "+y1+") to ("+ x2 +","+y2+") " + rsl);
    }

    public static void main(String[] args) {
        Point.distance(0, 0, 2, 0);
        Point.distance(0, 0, 5, 0);
        Point.distance(0, 5, 0, 0);
        Point.distance(1, 2, 3, 4);

    }




}
