package ru.job4j.polymorfism;

public class College {
    public static void main(String[] arg){
       Freshman freshman = new Freshman();
       Student student = freshman;
       Object obj = student;
    }
}
