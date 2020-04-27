package ru.job4j.inheritance;

public class Engineer extends Profession {

    String specialty;

    Engineer(){
        super();
        this.specialty = null;
    }

    Engineer (String name, String surname, String education, String birthday, String specialty ) {
        super(name, surname, education, birthday);
        this.specialty = specialty;
    }

    void doingCalculations(){
        System.out.println( "doing calculations");
    }

    String getSpecialty(){
        return this.specialty ;
    }

}
