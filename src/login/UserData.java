package login;

import user.User;

public class UserData {
    public static User[] users = {
        new User("admin", "12345", true),
        new User("user1", "abcde", false),
        new User("user2", "qwerty", false)
    };
}

