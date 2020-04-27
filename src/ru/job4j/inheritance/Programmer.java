package ru.job4j.inheritance;

public class Programmer extends Engineer {

    public int howMuchCodeWrote;

    Programmer(){
        super();
        this.howMuchCodeWrote = 0 ;
    }

    Programmer(String name, String surname, String education, String birthday, String specialty, int  howMuchCodeWrote) {
        super(name, surname, education, birthday, specialty);
        this.howMuchCodeWrote = howMuchCodeWrote;
    }

    public int howMuchCodeWrote() {
        return this.howMuchCodeWrote;
    }

    public void writesCode(Code code ) {
        System.out.println("Writes Code " + code.application );
    }

}
