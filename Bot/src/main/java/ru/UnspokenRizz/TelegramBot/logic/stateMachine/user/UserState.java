package ru.UnspokenRizz.TelegramBot.logic.stateMachine.user;

import ru.UnspokenRizz.TelegramBot.logic.stateMachine.State;

public abstract class UserState extends State {

    private UserStateMachine container;

    public UserState(UserStateMachine container) {
        this.container = container;
    }
}
