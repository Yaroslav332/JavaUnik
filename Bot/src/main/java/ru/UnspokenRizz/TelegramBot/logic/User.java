package ru.UnspokenRizz.TelegramBot.logic;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserComponent;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserDefaultComponent;

import java.lang.reflect.Type;
import java.util.HashMap;

public class User {
    public Long Id;
    private HashMap<Type, UserComponent> Components = new HashMap<>();

    public User(Long Id) {
        this.Id = Id;
        Components.put(UserDefaultComponent.class, new UserDefaultComponent());
    }

    public Result<UserComponent> GetComponent(Type type) {
        if (!Components.containsKey(type)) return new Result<>(null, new Exception("Component not found"));
        return new Result<>(Components.get(type), null);
    }

    public boolean AddComponent(UserComponent component) {
        if (Components.containsKey(component.getClass())) {
            return false;
        }
        Components.put(component.getClass(), component);
        return true;
    }

    public boolean RemoveComponent(Type type) {
        if (!Components.containsKey(type)) return false;
        Components.remove(type);
        return true;
    }
}
