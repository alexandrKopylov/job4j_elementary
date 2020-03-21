package ru.job4j.loop;

public class Mortgage {
   static  public int year(int amount, int salary, double percent) {
       double   ostatok = amount;
       int year = 0;
            while (ostatok>0){
                ostatok  = (ostatok + ostatok * (percent/100)) - salary;
                year +=1;
            }

        return year;
    }

    public static void main(String[] args) {
      // year(int amount, int salary, double percent)
       int eee= year(100, 70, 50);
        System.out.println(eee);
    }


}
