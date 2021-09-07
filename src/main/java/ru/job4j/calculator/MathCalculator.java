package ru.job4j.calculator;

import static ru.job4j.testing.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumTwoOperations(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return  subtraction(first, second)
                + division(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumTwoOperations(10, 20));
        System.out.println("Результат расчета равен: " + sumAllOperations(10, 20));
    }
}


