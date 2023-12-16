package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.User;
import ru.UnspokenRizz.TelegramBot.logic.managers.CommandManager;

public class ListCommand extends UserCommand{
    private final CommandManager commandManager;
    public ListCommand(CommandManager commandManager){
        this.commandManager = commandManager;
    }

    @Override
    public String getName() {
        return "/list";
    }

    @Override
    public Result<String> execute(User user, String[] args) {
        var res = commandManager.getCommands(user);
        StringBuilder sb = new StringBuilder();
        for (var c : res){
            sb.append(c.getName());
            sb.append('\n');
        }
        return new Result<>(sb.toString(), null);
    }
}
