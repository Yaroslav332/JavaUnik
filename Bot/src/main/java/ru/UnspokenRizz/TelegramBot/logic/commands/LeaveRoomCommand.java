package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.stateMachine.State;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.userStates.UserDefaultState;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.userStates.UserStateMachine;

public class LeaveRoomCommand implements ICommand {

    private final State owner;

    public LeaveRoomCommand(State owner) {
        this.owner = owner;
    }

    @Override
    public String getName() {
        return "/leaveRoom";
    }

    @Override
    public void Execute() {
        UserStateMachine t = (UserStateMachine) owner.getContainer();
        t.setCurrent(new UserDefaultState(t));
    }
}
