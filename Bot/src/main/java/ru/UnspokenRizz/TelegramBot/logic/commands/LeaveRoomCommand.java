package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.User;
import ru.UnspokenRizz.TelegramBot.logic.managers.RoomManager;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserDefaultComponent;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserInRoomComponent;

public class LeaveRoomCommand extends UserCommand {
    private final RoomManager roomManager;

    public LeaveRoomCommand(RoomManager roomManager) {
        this.roomManager = roomManager;
    }

    @Override
    public String getName() {
        return "/leaveRoom";
    }

    @Override
    public Result<String> execute(User user, String[] args) {
        var res = user.getComponent(UserInRoomComponent.class);
        if(res == null) return new Result<>(null, new Exception("Error"));
        //TODO leave room for guests
        roomManager.deleteRoom(user.Id);
        user.removeComponent(UserInRoomComponent.class);
        user.addComponent(UserDefaultComponent.class);
        return new Result<>("Left room", null);
    }
}
