package ru.UnspokenRizz.TelegramBot.logic.stateMachine.userStates;

import ru.UnspokenRizz.TelegramBot.logic.commands.CreateRoomCommand;
import ru.UnspokenRizz.TelegramBot.logic.commands.ICommand;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.State;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.StateMachine;

public class UserDefaultState extends State {
    ICommand[] commandList;
    public UserDefaultState(StateMachine container) {
        super(container);
        commandList = new ICommand[]{
                new CreateRoomCommand(this)
        };
    }

    @Override
    public ICommand[] getCommands() {
        return commandList;
    }
}
