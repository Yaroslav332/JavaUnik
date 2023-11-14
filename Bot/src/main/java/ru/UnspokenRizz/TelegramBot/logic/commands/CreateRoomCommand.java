package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.stateMachine.State;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.StateMachine;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.userStates.UserInRoomState;

public class CreateRoomCommand implements ICommand {

    private final State owner;

    public CreateRoomCommand(State owner) {
        this.owner = owner;
    }

    @Override
    public String getName() {
        return "/createRoom";
    }

    @Override
    public void Execute() {
        StateMachine t = owner.getContainer();
        //TODO create room manager
        t.setCurrent(new UserInRoomState(t, 0L));
    }
}
