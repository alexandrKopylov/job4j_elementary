package ru.job4j.testing.math;

public class MathFunction {

    public static double sum(double first, double second) {
        return first + second;
    }
    public static double multiply(double first, double second) {
        return first * second;
    }
    public static double subtraction(double first, double second) {
        return first - second;
    }
    public static double division(double first, double second) {
        if (second == 0){
            throw new IllegalArgumentException("second = 0");
        }
        return first / second;
    }
}