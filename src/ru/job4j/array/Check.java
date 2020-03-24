package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean etalon = data[0] ;
           for (int i=0;i<data.length;i++) {

               if (etalon != data[i]) {
                   result = false;
                   break;
               }
           }

        return result;
    }


}