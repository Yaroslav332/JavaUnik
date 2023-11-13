package ru.UnspokenRizz.TelegramBot.logic.stateMachine;

import org.apache.commons.lang3.NotImplementedException;
import ru.UnspokenRizz.TelegramBot.logic.commands.ICommand;

import java.util.List;

public class State{

    private final StateMachine Container;
    public State(StateMachine container){
        Container = container;
    }
    public void OnEnter(){

    }

    public void OnExit(){

    }

    public List<ICommand> getCommands(){
        throw new NotImplementedException();
    }
}
