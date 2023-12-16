package ru.UnspokenRizz.TelegramBot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.UnspokenRizz.TelegramBot.logic.CommandsHandler;
import ru.UnspokenRizz.TelegramBot.logic.commands.CreateRoomCommand;
import ru.UnspokenRizz.TelegramBot.logic.commands.LeaveRoomCommand;
import ru.UnspokenRizz.TelegramBot.logic.commands.ListCommand;
import ru.UnspokenRizz.TelegramBot.logic.commands.ShowStatsCommand;
import ru.UnspokenRizz.TelegramBot.logic.managers.*;
import ru.UnspokenRizz.TelegramBot.telegram.Bot;

public class Main {

    public static void main(String[] args) {

        CommandManager commandManager = new DefaultCommandManager();
        UserManager userManager = new DefaultUserManager();
        RoomManager roomManager = new DefaultRoomManager();

        commandManager.register(new CreateRoomCommand(roomManager));
        commandManager.register(new LeaveRoomCommand(roomManager));
        commandManager.register(new ListCommand(commandManager));
        commandManager.register(new ShowStatsCommand());

        try {
            Bot bot = new Bot(new CommandsHandler(commandManager, userManager));
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(bot);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}
