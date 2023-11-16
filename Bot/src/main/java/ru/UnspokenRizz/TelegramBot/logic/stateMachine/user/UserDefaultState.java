package ru.UnspokenRizz.TelegramBot.logic.stateMachine.user;

import ru.UnspokenRizz.TelegramBot.logic.commands.Command;
import ru.UnspokenRizz.TelegramBot.logic.commands.CreateRoomCommand;
import ru.UnspokenRizz.TelegramBot.logic.commands.ShowStatsCommand;

public class UserDefaultState extends UserState {

    public static final Command[] commandList = {
            CreateRoomCommand.Instance,
            ShowStatsCommand.Instance
    };

    public UserDefaultState(UserStateMachine container) {
        super(container);
    }

    @Override
    public Command[] getCommands() {
        return commandList;
    }
}
