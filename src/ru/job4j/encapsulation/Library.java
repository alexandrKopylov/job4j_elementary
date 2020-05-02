package ru.job4j.encapsulation;


public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Bukvar", 10);
        books[1] = new Book("Azbuka", 15);
        books[2] = new Book("Matematika", 55);
        books[3] = new Book("Clean code", 100);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getCount());
        }
        System.out.println();

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getCount());
        }
        System.out.println();

        // tmp =  books[0];

        for (int i = 0; i < books.length; i++) {

            if (books[i].equals("Clean code")) {
                System.out.println(books[i].getName() + " " + books[i].getCount());
            }
        }
    }
}