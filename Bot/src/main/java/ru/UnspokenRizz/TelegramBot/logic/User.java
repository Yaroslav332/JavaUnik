package ru.UnspokenRizz.TelegramBot.logic;

import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserComponent;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserDefaultComponent;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserInRoomComponent;

import java.lang.reflect.Type;
import java.util.HashMap;

public class User {
    public Long Id;
    private HashMap<Type, UserComponent> Components = new HashMap<>();
    private HashMap<Type, UserComponent> Pool = new HashMap<>();

    public User(Long Id) {
        this.Id = Id;
        Pool.put(UserDefaultComponent.class, new UserDefaultComponent());
        Pool.put(UserInRoomComponent.class, new UserInRoomComponent());
        addComponent(UserDefaultComponent.class);
    }

    public UserComponent getComponent(Class<? extends UserComponent> type) {
        if(!Components.containsKey(type))return null;
        return Components.get(type);
    }

    public UserComponent addComponent(Class<? extends UserComponent> type) {
        if(!Components.containsKey(type))Components.put(type, Pool.get(type));
        return Components.get(type);
    }

    public boolean removeComponent(Class<? extends UserComponent> type) {
        if (!Components.containsKey(type)) return false;
        Components.remove(type);
        return true;
    }
}
