package ru.job4j.exception;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                rsl = users[i];
                return rsl;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User not found in array.");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 4 || !user.isValid()) {
            throw new UserInvalidException("User not valid. ");
        }
        return user.isValid();
    }

    public static void main(String[] args) {
        User[] users = {
                             new User("Petr Arsentev", true),
                             new User("AL", true)
                     };
        try {
            User user = findUser(users, "AL");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ea) {
            System.out.println("the user is not valid");
        } catch (UserNotFoundException en) {
            System.out.println("user not found.");
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
