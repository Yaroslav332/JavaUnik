package ru.UnspokenRizz.TelegramBot.logic.managers;

import ru.UnspokenRizz.TelegramBot.logic.User;
import ru.UnspokenRizz.TelegramBot.logic.commands.*;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserDefaultComponent;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserInRoomComponent;

import java.util.ArrayList;

public class CommandManager {
    public static final ArrayList<UserCommand> Registry = new ArrayList<>();

    static {
        Registry.add(LeaveRoomCommand.Instance);
        Registry.add(CreateRoomCommand.Instance);
        Registry.add(ListCommand.Instance);
        Registry.add(ShowStatsCommand.Instance);
    }

    public static ArrayList<UserCommand> getCommands(User user){
        ArrayList<UserCommand> list = new ArrayList<>();

        if(user.GetComponent(UserDefaultComponent.class).Success())
            list.add(CreateRoomCommand.Instance);
        if(user.GetComponent(UserInRoomComponent.class).Success())
            list.add(LeaveRoomCommand.Instance);

        list.add(ShowStatsCommand.Instance);
        list.add(ListCommand.Instance);

        return list;
    }
}
