package ru.job4j.polymorfism;

public class Bus implements Transport{

    @Override
    public void go() {
        System.out.println("Bus go ");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("the bus is going with passengers" + passengers );

    }

    @Override
    public int refuel(int fuel) {
        int cost = fuel/50;
        System.out.println("the bus is filled with fuel ( "+fuel+" liters ) for the amount of " + cost);
        return cost;
    }
}
