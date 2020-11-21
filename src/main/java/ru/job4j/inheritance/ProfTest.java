package ru.job4j.inheritance;

import java.util.concurrent.Callable;

public class ProfTest {
    public static void main(String[] args) {
        // Profession tiger = new Profession("vasya", "pupkin", "vroch", "12");
        //  System.out.println("name = " + tiger.getName());

        // Profession tiger4 = new Profession();
        // System.out.println("name = " + tiger4.getName());

        // Doctor doc = new Doctor("Kplya", "pupkin", "vroch", "12","surgeon");
        // Doctor doc = new Doctor();
        //String tem = doc.getSpecialty();
        //System.out.println("Specialty = " + tem);
        //doc.getTemperature();
/*
        Engineer doc = new Engineer("Kplya", "pupkin", "vroch", "12","surgeon");
        // Doctor doc = new Doctor();
        String tem = doc.getSpecialty();
        System.out.println("Specialty = " + tem);
        doc.doingCalculations();

      Dentist doc = new Dentist("Kplya", "pupkin", "vroch", "12","surgeon","tooth");
        Tooth zub = new Tooth(15);
        doc.removeTooth(zub);

        Builder doc = new Builder("Kplya", "pupkin", "vroch", "12", "surgeon", 15);
      //  Builder doc = new Builder();
        int j = doc.GetHowManyHousesBuilt();
        System.out.println("j = " + j);


        Builder doc = new Builder("Kplya", "pupkin", "vroch", "12", "surgeon", 15);
        //  Builder doc = new Builder();
        int j = doc.GetHowManyHousesBuilt();
        System.out.println("j = " + j);

        Drawing draw = new  Drawing("house");
        doc.drawsDrawing(draw);

*/

       Programmer doc = new Programmer("Kplya", "pupkin", "vroch", "12", "surgeon", 15);
        //  Builder doc = new Builder();
        int j = doc.howMuchCodeWrote;
        System.out.println("j = " + j);

        Code code = new Code("Server");
        doc.writesCode(code);


    }
}
