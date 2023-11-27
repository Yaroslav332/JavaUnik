package ru.UnspokenRizz.TelegramBot.logic.commands;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.User;
import ru.UnspokenRizz.TelegramBot.logic.managers.CommandManager;

public class ListCommand extends UserCommand{

    public static final ListCommand Instance = new ListCommand();

    private ListCommand(){

    }

    @Override
    public String getName() {
        return "/list";
    }

    @Override
    public Result<String> Execute(User user, String[] args) {
        var res = CommandManager.getCommands(user);
        StringBuilder sb = new StringBuilder();
        for (var c : res){
            sb.append(c.getName());
            sb.append('\n');
        }
        return new Result<>(sb.toString(), null);
    }
}
