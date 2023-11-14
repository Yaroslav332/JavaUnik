package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.stateMachine.State;

public class ShowStatsCommand implements ICommand {

    private final State owner;

    public ShowStatsCommand(State owner) {
        this.owner = owner;
    }

    @Override
    public String getName() {
        return "/showStats";
    }

    @Override
    public void Execute() {
        //TODO
    }
}
