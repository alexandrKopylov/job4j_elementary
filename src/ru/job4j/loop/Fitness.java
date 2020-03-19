package ru.job4j.loop;


public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (nik > ivan) {
            ivan = ivan * 3;
            nik = nik * 2;
            month += 1;
        }
        return month;
    }
}
