package ru.job4j.polymorfism;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        input.nextLine();
        String answerStr = "";
        int answer = new Random().nextInt(3);
        switch (answer) {
            case (1):
                answerStr = "Yes";
                break;
            case (2):
                answerStr = "No";
                break;
            default:
                answerStr = "maybe";
        }
        System.out.println(answerStr);
    }
}
