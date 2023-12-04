package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.User;
import ru.UnspokenRizz.TelegramBot.logic.managers.DefaultRoomManager;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserDefaultComponent;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserInRoomComponent;

public class CreateRoomCommand extends UserCommand {

    public static final CreateRoomCommand Instance = new CreateRoomCommand();

    private CreateRoomCommand() {

    }

    @Override
    public String getName() {
        return "/createRoom";
    }

    @Override
    public Result<String> execute(User user, String[] args) {
        if (!user.removeComponent(UserDefaultComponent.class))
            return new Result<>(null, new Exception("Error"));

        var room = DefaultRoomManager.Instance.createRoom(user.Id);
        if(!room.Success())
            return new Result<>(null, new Exception("Error"));

        ((UserInRoomComponent)user.addComponent(UserInRoomComponent.class)).RoomId = room.result();
        return new Result<>("Room is created", null);
    }
}
