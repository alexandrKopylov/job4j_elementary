package ru.job4j.inheritance;

   public class Tiger  extends Predator {

    public Tiger() {
        super();
       System.out.println("Konstruktor Tiger");
    }
       public Tiger(String name) {
           super(name);
           System.out.println("Konstruktor s parametrom Tiger");
       }
    public static void main(String[] args) {
        Tiger  tiger = new Tiger("tiger");
        System.out.println("name = " + tiger.name);

    }
}
