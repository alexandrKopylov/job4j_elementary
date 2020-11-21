package ru.job4j.calculator;

public class Fit {
   // Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
   // Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.

    public static double manWeight(double height) {
        double rsl = (height-100)*1.15;
        return rsl;
    }


    public static double womanWeight(double height) {
        double rsl = (height-110)*1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double height = 180;
        double man = Fit.manWeight( height);
        System.out.println("the man with the growth "+ height +" ideal weight "+ man);

        man = Fit.womanWeight( height);
        System.out.println("the woman with the growth "+ height +" ideal weight "+ man);
    }
}
