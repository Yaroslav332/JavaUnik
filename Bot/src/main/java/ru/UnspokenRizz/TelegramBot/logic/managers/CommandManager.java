package ru.UnspokenRizz.TelegramBot.logic.managers;
import ru.UnspokenRizz.TelegramBot.logic.User;
import ru.UnspokenRizz.TelegramBot.logic.commands.UserCommand;
import java.util.ArrayList;

public interface CommandManager {
    ArrayList<UserCommand> getRegistry();

    void register(UserCommand userCommand);

    ArrayList<UserCommand> getCommands(User user);
}
