package ru.job4j.inheritance;

public class Dentist extends Doctor {

    String whatTreats;

    Dentist() {
        super();
        this.whatTreats = null;
    }

    Dentist(String name, String surname, String education, String birthday, String specialty, String whatTreats) {
        super(name, surname, education, birthday, specialty);
        this.whatTreats = whatTreats;
    }

    public String GetWhatTreats() {
        return this.whatTreats;
    }

    public void removeTooth(Tooth tooth) {
        System.out.println("remove " + tooth.whichToothHurts + " tooth");
    }


}
