package ru.job4j.tracker;

public class Tttttt {
    static public void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);

        Item item2 = new Item("test2");
        tracker.add(item2);

        Item[] result = tracker.findAll();

        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
}
