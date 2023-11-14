package ru.UnspokenRizz.TelegramBot.logic.stateMachine.userStates;

import ru.UnspokenRizz.TelegramBot.logic.commands.CreateRoomCommand;
import ru.UnspokenRizz.TelegramBot.logic.commands.ICommand;
import ru.UnspokenRizz.TelegramBot.logic.commands.ShowStatsCommand;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.State;

public class UserDefaultState extends State {
    ICommand[] commandList;

    public UserDefaultState(UserStateMachine container) {
        super(container);
        commandList = new ICommand[]{
                new CreateRoomCommand(this),
                new ShowStatsCommand(this)
        };
    }

    @Override
    public ICommand[] getCommands() {
        return commandList;
    }
}
