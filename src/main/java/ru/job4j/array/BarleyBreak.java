package ru.job4j.array;

public class BarleyBreak {

    public static void main(String[] args) {

        int[][] mas = new int[3][3];
        mas[0][0] = 1;
        mas[0][1] = 2;
        mas[0][2] = 3;
        mas[1][0] = 4;
        mas[1][1] = 5;
        mas[1][2] = 6;
        mas[2][0] = 7;
        mas[2][1] = 8;
        mas[2][2] = 9;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[1].length; j++) {
                System.out.print(" " + mas[i][j] + " ");
            }
            System.out.println();
        }

    }
}
