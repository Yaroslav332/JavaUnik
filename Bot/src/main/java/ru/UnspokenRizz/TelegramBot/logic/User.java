package ru.UnspokenRizz.TelegramBot.logic;

import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserStateMachine;

public class User {
    public Long Id;
    public UserStateMachine stateMachine;

    public User(Long Id) {
        this.Id = Id;
        stateMachine = new UserStateMachine(Id);
    }
}
