package ru.job4j.inheritance;

public class Builder extends Engineer {

    public int howManyHousesBuilt;

    Builder(){
        super();
        this.howManyHousesBuilt = 0 ;
    }

    Builder(String name, String surname, String education, String birthday, String specialty, int  howManyHousesBuilt) {
       super(name, surname, education, birthday, specialty);
        this.howManyHousesBuilt = howManyHousesBuilt;
    }

    public int GetHowManyHousesBuilt() {
        return this.howManyHousesBuilt;
    }

    public void drawsDrawing(Drawing  drawing ) {
        System.out.println("drawing " + drawing.facility );
    }
}
