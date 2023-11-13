package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.User;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserDefaultComponent;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserInRoomComponent;

public class LeaveRoomCommand extends UserCommand {

    public static final LeaveRoomCommand Instance = new LeaveRoomCommand();

    private LeaveRoomCommand() {

    }

    @Override
    public String getName() {
        return "/leaveRoom";
    }

    @Override
    public Result<String> Execute(User user, String[] args) {
        var res = user.GetComponent(UserInRoomComponent.class);
        if(!res.Success()) return new Result<>(null, new Exception("Error"));
        Long roomId = ((UserInRoomComponent)res.result()).RoomId;
        //TODO leave room
        user.RemoveComponent(UserInRoomComponent.class);
        user.AddComponent(new UserDefaultComponent());
        return new Result<>("Left room", null);
    }
}
