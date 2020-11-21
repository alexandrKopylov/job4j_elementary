package ru.job4j.condition;

public class StringEq {

    public static boolean check(String login) {
        String root = new String("root");

        boolean access = false;

        if (root.equals(login)) {
             access = true;
        } else {
            access = false;
        }


        return access;
    }

    public static void main(String[] args) {
        String your = "Vasya";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);

        your = "Sasha";
        userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);

         your = "root";
        userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }
}
