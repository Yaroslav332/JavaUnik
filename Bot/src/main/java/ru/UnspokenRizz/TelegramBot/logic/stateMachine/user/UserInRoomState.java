package ru.UnspokenRizz.TelegramBot.logic.stateMachine.user;

import ru.UnspokenRizz.TelegramBot.logic.commands.Command;
import ru.UnspokenRizz.TelegramBot.logic.commands.LeaveRoomCommand;

public class UserInRoomState extends UserState {

    public Long RoomId = 0L;
    public static final Command[] commandList = {
            LeaveRoomCommand.Instance
    };

    public UserInRoomState(UserStateMachine container) {
        super(container);
    }

    @Override
    public Command[] getCommands() {
        return commandList;
    }
}
