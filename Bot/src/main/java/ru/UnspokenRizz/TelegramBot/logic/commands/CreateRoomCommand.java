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
    public Result<String> Execute(User user, String[] args) {
        if (!user.RemoveComponent(UserDefaultComponent.class))
            return new Result<>(null, new Exception("Error"));

        var room = DefaultRoomManager.Instance.createRoom(user.Id);
        if(!room.Success())
            return new Result<>(null, new Exception("Error"));

        user.AddComponent(new UserInRoomComponent(room.result()));
        return new Result<>("Room is created", null);
    }
}
