package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    void giveNick(String nick){
        this.name = nick;
    }

    public void show() {
        System.out.println("Котик по кличке " + this.name +" ест "+  this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {

        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.eat("kotleta");
        gav.show();

        Cat black = new Cat();
        black.giveNick("Черныш");
        black.eat("fish");
        black.show();
    }
}