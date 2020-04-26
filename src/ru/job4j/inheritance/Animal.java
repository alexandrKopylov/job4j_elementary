package ru.job4j.inheritance;

public class Animal {
    String name;
    public Animal(){
        super();
        System.out.println("Konstruktor Animal");
    }
    public Animal(String name){
        this.name = name;
        System.out.println("Konstruktor s parametrom Animal");
    }

}

