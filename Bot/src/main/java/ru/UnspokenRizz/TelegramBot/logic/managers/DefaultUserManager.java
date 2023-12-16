package ru.UnspokenRizz.TelegramBot.logic.managers;

import ru.UnspokenRizz.TelegramBot.logic.User;

import java.util.HashMap;

public class DefaultUserManager implements UserManager {
    private HashMap<Long, User> dict = new HashMap<>();

    public User getUser(Long UserId) {
        if(!dict.containsKey(UserId)){
            dict.put(UserId, new User(UserId));
        }
        return dict.get(UserId);
    }
}
