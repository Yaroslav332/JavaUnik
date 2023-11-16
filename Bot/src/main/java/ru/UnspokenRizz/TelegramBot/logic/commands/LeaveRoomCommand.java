package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserInRoomState;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserStateMachine;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserStateType;

public class LeaveRoomCommand extends UserCommand {

    public static final LeaveRoomCommand Instance = new LeaveRoomCommand();

    private LeaveRoomCommand() {

    }

    @Override
    public String getName() {
        return "/leaveRoom";
    }

    @Override
    public Result<String> Execute(UserStateMachine userStateMachine, String[] args) {
        Long roomId = ((UserInRoomState) userStateMachine.getState(UserStateType.InRoom)).RoomId;
        //TODO leave room
        if (!userStateMachine.setState(UserStateType.Default))
            return new Result<>(null, new Exception("No such state"));
        return new Result<>("Room left", null);
    }
}
