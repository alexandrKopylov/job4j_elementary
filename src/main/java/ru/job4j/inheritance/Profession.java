package ru.job4j.inheritance;

public class Profession {
    String name;
    String surname;
    String education;
    String birthday;

    Profession (String name,String surname,String education,String birthday){
        this.name =name;
        this.surname = surname;
        this.education =education;
        this. birthday =  birthday;
    }

   Profession (){
    }

    public String getName(){
        return this.name ;
    }

}
