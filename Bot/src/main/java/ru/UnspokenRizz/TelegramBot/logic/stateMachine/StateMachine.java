package ru.UnspokenRizz.TelegramBot.logic.stateMachine;

public class StateMachine {
    private State Current;

    private State getCurrent() {
        return Current;
    }

    public StateMachine(State initial) {
        Current = initial;
    }

    public void setCurrent(State newState) {
        Current.OnExit();
        Current = newState;
        Current.OnEnter();
    }
}
