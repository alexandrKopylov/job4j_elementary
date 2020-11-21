package ru.job4j.array;


public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int indexNotNull = index;
                int index2 = index;
                Boolean swop = false;
                while (index2 < array.length) {
                    indexNotNull++;
                    if (indexNotNull > array.length - 1) {
                        indexNotNull = array.length - 1;
                    }
                    if (array[indexNotNull] != null) {
                        index2 = array.length + 1;
                        swop = true;
                    }
                    index2++;
                }
                if (swop) {
                    array[index] = array[indexNotNull];
                    array[indexNotNull] = null;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}