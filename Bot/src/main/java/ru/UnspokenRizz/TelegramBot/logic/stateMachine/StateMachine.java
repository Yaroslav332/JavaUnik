package ru.UnspokenRizz.TelegramBot.logic.stateMachine;

import org.apache.commons.lang3.NotImplementedException;
import ru.UnspokenRizz.TelegramBot.logic.commands.ICommand;

import java.util.List;

public class StateMachine {
    private State Current;

    public State getCurrent(){
        return Current;
    }

    public void setCurrent(State newState){
        Current.OnExit();
        Current = newState;
        Current.OnEnter();
    }

    public List<ICommand> getCommands(){
        return getCurrent().getCommands();
    }
}
