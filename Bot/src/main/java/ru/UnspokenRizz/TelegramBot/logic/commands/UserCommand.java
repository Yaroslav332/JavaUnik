package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.User;

public abstract class UserCommand extends Command {

    public abstract Result<String> execute(User user, String[] args);

}
