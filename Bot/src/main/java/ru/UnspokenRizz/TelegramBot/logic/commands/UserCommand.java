package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserStateMachine;

public abstract class UserCommand extends Command {

    public abstract Result<String> Execute(UserStateMachine userStateMachine, String[] args);
}
