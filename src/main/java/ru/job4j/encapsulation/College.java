package ru.job4j.encapsulation;

public class College {
    public static void main(String[] args) {
        Student  student  = new Student ();
        student.setName("ALex");
        student.setSurname("Kop");
        student.setPatronymic("Serg");
        student.setGroup("185");
        student.setData("10/10/1998");

        System.out.println( student.getName() + student.getSurname() +  student.getPatronymic() + student.getGroup()+student.getData());
    }

}
