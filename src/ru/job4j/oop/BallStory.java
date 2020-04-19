package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare zayac = new Hare();
        Wolf volk = new Wolf();
        Fox lisa = new Fox();

        System.out.println("бежал колобок, а на встречу ему заяц");
        zayac.tryEat(kolobok);
        System.out.println("бежал колобок, а на встречу ему волк");
        volk.tryEat(kolobok);
        System.out.println("бежал колобок, а на встречу ему лиса");
        lisa.tryEat(kolobok);
    }
}
