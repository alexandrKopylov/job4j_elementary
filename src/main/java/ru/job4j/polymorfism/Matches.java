package ru.job4j.polymorfism;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        System.out.println("Игра 11. Смысл игры в следующем. На столе лежат 11 спичек." +
                " Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.");
        int matches = 11;
        boolean game = true;
        while (game) {
            matches = motion(matches, "player 1");
            if (matches == 0) {
                game = false;
                System.out.println("player 1 win");
            } else {
                matches = motion(matches, "player 2");
                if (matches == 0) {
                    game = false;
                    System.out.println("player 2 win");
                }
            }
        }
    }

    static public int motion(int matches, String player) {
        Scanner input = new Scanner(System.in);
        System.out.println("On the table " + matches + " matches");
        boolean take1player = true;
        while (take1player) {
            System.out.print(" How much will " + player + " take : ");
            int takeMatches = Integer.valueOf(input.nextLine());
            if (takeMatches > 0 && takeMatches < 4 && takeMatches <= matches) {
                take1player = false;
                matches = matches - takeMatches;
            }
        }
        return matches;
    }
}
