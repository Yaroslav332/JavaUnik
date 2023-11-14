package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.stateMachine.State;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.StateMachine;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.userStates.UserDefaultState;

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
        StateMachine t = owner.getContainer();
        t.setCurrent(new UserDefaultState(t));
    }
}
