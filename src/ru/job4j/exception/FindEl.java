package ru.job4j.exception;

public class FindEl {




    public static int indexOf(String[] value, String key) throws UserNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key) ) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new UserNotFoundException("key not found in array.");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] arrayValue = {"124", "125", "126"};
        try {
            int index = indexOf(arrayValue, "124");
            System.out.println(index);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }

}
