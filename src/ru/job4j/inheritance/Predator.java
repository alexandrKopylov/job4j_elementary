package ru.job4j.inheritance;

public class Predator extends Animal  {

    public Predator(){
        super();
        System.out.println("Konstruktor Predator");
    }
    public Predator(String name){
        super(name);
        System.out.println("Konstruktor s parametom Predator");
    }

}
