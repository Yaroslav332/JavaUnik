package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.User;

public class ShowStatsCommand extends UserCommand {
    public ShowStatsCommand() {

    }

    @Override
    public String getName() {
        return "/showStats";
    }

    @Override
    public Result<String> execute(User user, String[] args) {
        //TODO
        return new Result<>(user.Id.toString(), null);
    }
}
