package ru.UnspokenRizz.TelegramBot.logic.commands;


import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.User;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserDefaultComponent;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserInRoomComponent;

public class StartGameCommand extends UserCommand {
    @Override
    public String getName() {
        return "/startGame";
    }

    @Override
    public Result<String> execute(User user, String[] args) {
        var res = user.getComponent(UserInRoomComponent.class);
        if(res == null) return new Result<>(null, new Exception("Error"));
        user.addComponent(UserDefaultComponent.class);
        return new Result<>("Started game", null);
    }
}
