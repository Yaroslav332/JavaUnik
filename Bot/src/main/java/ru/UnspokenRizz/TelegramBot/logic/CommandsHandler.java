package ru.UnspokenRizz.TelegramBot.logic;

import ru.UnspokenRizz.TelegramBot.AnswerWriter;
import ru.UnspokenRizz.TelegramBot.MessageHandler;
import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.commands.Command;
import ru.UnspokenRizz.TelegramBot.logic.commands.UserCommand;
import ru.UnspokenRizz.TelegramBot.logic.managers.UserManager;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.user.UserStateMachine;

import java.util.Arrays;

public class CommandsHandler implements MessageHandler {
    @Override
    public void handle(BotRequest request, AnswerWriter writer) {
        String[] req = request.Data().split(" ");
        Long id = request.UserId();
        User user = UserManager.getUser(id);
        UserStateMachine sm = user.stateMachine;
        Result<String> res = null;

        for (Command i : sm.getState(sm.getCurrent()).getCommands()) {
            if (i.getName().equals(req[0])) {
                var args = new String[req.length-1];
                System.arraycopy(req, 1, args, 0, req.length - 1);
                res =
                        ((UserCommand) i).Execute(sm, args);
                break;
            }
        }

        if(res!=null) writer.writeAnswer(new BotResponse(res.result()));
        else writer.writeAnswer(new BotResponse("No such command"));
    }
}
