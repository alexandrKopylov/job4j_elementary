package ru.job4j.condition;

public class SqArea {


    public static double square(int p, int k) {

       // h = p / (2 * (k + 1));
       // L = h * k;
       // s = L * h;
        double h = p/(2*(k+1));
        double L = h*k;

        double rsl = h * L;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}