package ru.UnspokenRizz.TelegramBot.logic.stateMachine;

import ru.UnspokenRizz.TelegramBot.logic.commands.ICommand;

public class StateMachine {
    private State Current;

    public State getCurrent() {
        return Current;
    }

    public void setCurrent(State newState) {
        Current.OnExit();
        Current = newState;
        Current.OnEnter();
    }

    public ICommand[] getCommands() {
        return getCurrent().getCommands();
    }
}
