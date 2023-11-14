package ru.UnspokenRizz.TelegramBot.logic.stateMachine.userStates;

import ru.UnspokenRizz.TelegramBot.logic.commands.ICommand;
import ru.UnspokenRizz.TelegramBot.logic.commands.LeaveRoomCommand;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.State;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.StateMachine;

public class UserInRoomState extends State {

    ICommand[] commandList;


    public UserInRoomState(UserStateMachine container, Long roomId) {
        super(container);
        commandList = new ICommand[]{
                new LeaveRoomCommand(this)
        };
    }


}
