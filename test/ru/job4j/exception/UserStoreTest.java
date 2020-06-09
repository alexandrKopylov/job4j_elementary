package ru.job4j.exception;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static ru.job4j.exception.UserStore.findUser;

public class UserStoreTest {
    @Test
    public void whenfindUserReturnUser() throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("AL", true)};
        User user = findUser(users, "AL");
        assertThat(user.getUsername(), is("AL"));
    }
    @Test(expected =  UserNotFoundException.class)
    public void whenfindUserReturnExp() throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("AL", true)};
        User user = findUser(users, "Sasha");
    }

    @Test
    public void whenValidateReturnTrue() throws UserInvalidException {
       User user = new User("Alexx",true);
       boolean result = UserStore.validate(user);
        assertThat(result, is(true));
    }

    @Test(expected = UserInvalidException.class)
    public void whenValidateReturnExp() throws UserInvalidException {
        User user = new User("Alexx",false);
        boolean result = UserStore.validate(user);
    }

    @Test(expected = UserInvalidException.class)
    public void whenValidateReturnExp2() throws UserInvalidException {
        User user = new User("Ale",true);
        boolean result = UserStore.validate(user);
    }
}