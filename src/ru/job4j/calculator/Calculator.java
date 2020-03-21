package ru.job4j.calculator;

/**Class Calculator сложение чисел
 *                  вычитание чисел
 *                  умножение
 *                  деление
 *  @author Alexandr Kopylov
 *  @since 21.03.2020
 */



public class Calculator {

    /**
     * Метод для тестирования нашего приложентя
     * @param args
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        int  six = 6;
        int  four = 4;
        int  five = 5;
        int  sixDivTwo = six / two;
        int  fiveMinusTwo = five - two;
        int  fourTimeTwo = four * two;
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }

}
