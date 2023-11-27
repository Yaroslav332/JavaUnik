package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.User;
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
        //TODO implement room manager
        user.AddComponent(new UserInRoomComponent(0L));
        return new Result<>("Room is created", null);
    }
}
