package ru.UnspokenRizz.TelegramBot.logic.stateMachine;

import java.util.HashMap;

public abstract class EnumHashedStateMachine<T extends Enum<T>, K extends State> {

    protected StateMachine stateMachine;
    protected HashMap<T, K> hashMap = new HashMap<>();
    protected T Current;

    public T getCurrent() {
        return Current;
    }

    public K getState(T type) {
        return hashMap.get(type);
    }

    public boolean setState(T state) {
        if (!hashMap.containsKey(state)) return false;
        K res = hashMap.get(state);
        stateMachine.setCurrent(res);
        Current = state;
        return true;
    }
}
