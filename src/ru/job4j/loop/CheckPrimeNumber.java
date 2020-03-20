package ru.job4j.loop;


public class CheckPrimeNumber {

    public static boolean check(int n) {

        if(n==1) return false;

        boolean prime = true;

        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
    }
