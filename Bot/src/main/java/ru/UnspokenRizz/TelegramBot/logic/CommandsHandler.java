package ru.UnspokenRizz.TelegramBot.logic;

import ru.UnspokenRizz.TelegramBot.AnswerWriter;
import ru.UnspokenRizz.TelegramBot.MessageHandler;
import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.commands.UserCommand;
import ru.UnspokenRizz.TelegramBot.logic.managers.CommandManager;
import ru.UnspokenRizz.TelegramBot.logic.managers.UserManager;

import java.util.Arrays;

public class CommandsHandler implements MessageHandler {

    private final CommandManager commandManager;
    private final UserManager userManager;

    public CommandsHandler(CommandManager commandManager, UserManager userManager) {
        this.commandManager = commandManager;
        this.userManager = userManager;
    }

    @Override
    public void handle(BotRequest request, AnswerWriter writer) {
        String[] req = request.Data().split(" ");
        Long id = request.UserId();
        User user = userManager.getUser(id);

        Result<String> result = null;

        for (UserCommand c : commandManager.getRegistry()) {
            if (c.getName().equals(req[0])) {
                String[] args = Arrays.copyOfRange(req, 1, req.length);
                result = c.execute(user, args);
            }
        }

        //TODO
        //Тут тебе вклинить код, который будет обрабатываться, если ни одна из комманд не сработала (result == null)
        //А значит тебе нужно проверить, что это ответ на заданный вопрос и там уже обработать, если надо

        if (result == null) writer.writeAnswer(new BotResponse("No such command"));
        else if (result.Success()) writer.writeAnswer(new BotResponse(result.result()));
        else writer.writeAnswer(new BotResponse(result.exception().getMessage()));
    }
}
