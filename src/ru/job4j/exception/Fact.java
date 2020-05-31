package ru.job4j.exception;

public class Fact {
    public static void main(String[] args) {

        System.out.println("factorial 5 =" + calc(-5));
    }

    static public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("argument must be a positive number.");
        } else {
            int rsl = 1;
            for (int index = 1; index <= n; index++) {
                rsl *= index;
            }
            return rsl;
        }
    }
}