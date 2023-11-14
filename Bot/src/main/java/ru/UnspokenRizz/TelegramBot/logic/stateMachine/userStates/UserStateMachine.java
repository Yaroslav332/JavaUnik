package ru.UnspokenRizz.TelegramBot.logic.stateMachine.userStates;

import ru.UnspokenRizz.TelegramBot.logic.stateMachine.StateMachine;

public class UserStateMachine extends StateMachine {
    private final Long UserId;

    public UserStateMachine(Long UserId){
        this.UserId = UserId;
    }
    public Long getUserId(){
        return UserId;
    }
}
