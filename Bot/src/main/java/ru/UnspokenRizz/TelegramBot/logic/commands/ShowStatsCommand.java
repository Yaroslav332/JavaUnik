package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserStateMachine;

public class ShowStatsCommand extends UserCommand {

    public static final ShowStatsCommand Instance = new ShowStatsCommand();

    private ShowStatsCommand() {

    }

    @Override
    public String getName() {
        return "/showStats";
    }

    @Override
    public Result<String> Execute(UserStateMachine userStateMachine, String[] args) {
        //TODO
        return new Result<>(userStateMachine.getUserId().toString(), null);
    }
}
