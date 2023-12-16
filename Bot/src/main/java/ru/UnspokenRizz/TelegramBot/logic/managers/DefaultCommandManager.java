package ru.UnspokenRizz.TelegramBot.logic.managers;

import ru.UnspokenRizz.TelegramBot.logic.User;
import ru.UnspokenRizz.TelegramBot.logic.commands.*;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserDefaultComponent;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserInRoomComponent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class DefaultCommandManager implements CommandManager {
    private final ArrayList<UserCommand> Registry = new ArrayList<>();
    private final HashMap<Class<? extends UserCommand>, UserCommand> mapRegistry = new HashMap<>();
    public DefaultCommandManager(){
    }

    @Override
    public ArrayList<UserCommand> getRegistry() {
        return (ArrayList<UserCommand>)Registry.clone();
    }

    @Override
    public void register(UserCommand userCommand) {
        Registry.add(userCommand);
        mapRegistry.put(userCommand.getClass(), userCommand);
    }

    public ArrayList<UserCommand> getCommands(User user) {
        ArrayList<UserCommand> list = new ArrayList<>();

        if (user.getComponent(UserDefaultComponent.class) != null)
            list.add(mapRegistry.get(CreateRoomCommand.class));
        if (user.getComponent(UserInRoomComponent.class) != null)
            list.add(mapRegistry.get(LeaveRoomCommand.class));

        list.add(mapRegistry.get(ShowStatsCommand.class));
        list.add(mapRegistry.get(ListCommand.class));

        return list;
    }
}
