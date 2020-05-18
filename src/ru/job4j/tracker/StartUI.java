package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {

        boolean run = true;
        while (run) {
            this.showMenu();

            int select = Integer.valueOf(scanner.nextLine());
            switch (select) {
                case (0):
                    System.out.println();
                    System.out.println("=== Create a new Item ====");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    tracker.add(item);
                    break;
                case (1):
                    System.out.println();
                    System.out.println("=== Show all items ====");
                    Item[] result = tracker.findAll();
                    for (int i = 0; i < result.length; i++) {

                        System.out.println(result[i]);
                    }
                    break;
                case (2):
                    System.out.println();
                    System.out.println("=== Edit item ===");
                    System.out.print("Enter id: ");
                    name = scanner.nextLine();
                    System.out.print("Enter New Item : ");
                    String name2 = scanner.nextLine();
                    item = new Item(name2);
                    if (tracker.replace(name, item)) {
                        System.out.println("application successfully changed");
                    } else {
                        System.out.println("the application is not changed");
                    }

                    break;
                case (3):
                    System.out.println();
                    System.out.println("=== Delete item ===");
                    System.out.print("Enter id: ");
                    name = scanner.nextLine();
                    if (tracker.delete(name)) {
                        System.out.println("application successfully delete");
                    } else {
                        System.out.println("the application is not delete ");
                    }
                    break;
                case (4):
                    System.out.println();
                    System.out.println("=== Find item by Id ===");
                    System.out.print("Enter id: ");
                    name = scanner.nextLine();
                    Item tmp = tracker.findById(name);
                    if (tmp == null) {
                        System.out.println("application not found");
                    } else {
                        System.out.println(tmp);
                    }
                    break;
                case (5):
                    System.out.println();
                    System.out.println("=== Find items by name ===");
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    result = tracker.findByName(name);
                    for (int i = 0; i < result.length; i++) {
                        System.out.println(result[i]);
                    }
                    break;
                case (6):
                    System.out.println();
                    System.out.println("Exit");
                    run = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("select item (0-6) ");
            }
        }
    }

    private void showMenu() {

        System.out.println();
        System.out.println();
        System.out.println("Menu.");
        System.out.println("0. Add new Item ");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.print("Select:");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

}