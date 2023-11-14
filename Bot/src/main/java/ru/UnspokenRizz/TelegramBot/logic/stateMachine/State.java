package ru.UnspokenRizz.TelegramBot.logic.stateMachine;

import org.apache.commons.lang3.NotImplementedException;
import ru.UnspokenRizz.TelegramBot.logic.commands.ICommand;

public class State {

    private final StateMachine Container;

    public State(StateMachine container) {
        Container = container;
    }

    public StateMachine getContainer() {
        return Container;
    }

    public void OnEnter() {

    }

    public void OnExit() {

    }

    public ICommand[] getCommands() {
        throw new NotImplementedException();
    }
}
