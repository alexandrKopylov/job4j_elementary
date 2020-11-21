package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {

        int polDlinni = (int) array.length / 2;

        for (int i = 0; i < polDlinni; i++) {
            int n = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = n;
        }

        return array;
    }

}
