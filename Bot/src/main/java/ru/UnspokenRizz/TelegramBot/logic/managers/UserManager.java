package ru.UnspokenRizz.TelegramBot.logic.managers;

import ru.UnspokenRizz.TelegramBot.logic.User;

//TODO mocked
public class UserManager {

    private static final User user = new User(0L);

    public static User getUser(Long UserId) {
        return user;
    }
}
