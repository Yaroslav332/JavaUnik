package ru.UnspokenRizz.TelegramBot.logic.stateMachine;

import ru.UnspokenRizz.TelegramBot.logic.commands.Command;

public class State {

    public void OnEnter() {

    }

    public void OnExit() {

    }

    public Command[] getCommands() {
        return null;
    }

    public String[] getCommandNames() {
        Command[] commands = getCommands();
        if (commands.length == 0) return new String[0];
        String[] r = new String[commands.length];
        for (int i = 0; i < commands.length; i++) {
            r[i] = commands[i].getName();
        }
        return r;
    }
}
