package ru.job4j.inheritance;

public class Doctor extends Profession {

    String specialty;

    Doctor(){
        super();
        this.specialty = null;
    }

    Doctor (String name, String surname, String education, String birthday, String specialty ) {
        super(name, surname, education, birthday);
            this.specialty = specialty;
    }

     void getTemperature(){
        System.out.println( "measures temperature");
    }

   String getSpecialty(){
        return this.specialty ;
    }
}
