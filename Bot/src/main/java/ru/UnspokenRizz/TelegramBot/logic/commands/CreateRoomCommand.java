package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserInRoomState;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserStateMachine;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserStateType;

public class CreateRoomCommand extends UserCommand {

    public static final CreateRoomCommand Instance = new CreateRoomCommand();

    private CreateRoomCommand() {

    }

    @Override
    public String getName() {
        return "/createRoom";
    }

    @Override
    public Result<String> Execute(UserStateMachine userStateMachine, String[] args) {
        if (!userStateMachine.setState(UserStateType.InRoom)) {
            return new Result<>(null, new Exception("No state of such type"));
        }
        //TODO create room manager
        ((UserInRoomState) userStateMachine.getState(UserStateType.InRoom)).RoomId = 0L;
        return new Result<>("Created room", null);
    }
}
