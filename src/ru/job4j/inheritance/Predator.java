package ru.job4j.inheritance;

public class Predator extends Animal  {

    public Predator(){
        System.out.println("Predator");
    }

    public static void main(String[] args) {
        Predator bug = new Predator();
    }
}
