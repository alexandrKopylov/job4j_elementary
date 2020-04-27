package ru.job4j.inheritance;

public class Surgeon extends  Doctor {

   boolean initialInspection;

    Surgeon() {
        super();
        this.initialInspection = false ;
    }

    Surgeon(String name, String surname, String education, String birthday, String specialty, boolean initialInspection) {
        super(name, surname, education, birthday, specialty);
        this.initialInspection =initialInspection;
    }

    public boolean GetInitialInspection() {
        return this.initialInspection;
    }

    public void removeAppendicit() {
        System.out.println("remove Appendicit");
    }
}



