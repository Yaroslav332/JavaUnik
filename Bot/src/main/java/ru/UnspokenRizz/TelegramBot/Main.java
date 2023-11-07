package ru.UnspokenRizz.TelegramBot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.UnspokenRizz.TelegramBot.logic.EchoMassageHandler;
import ru.UnspokenRizz.TelegramBot.telegram.Bot;

public class Main {

    public static void main(String[] args) {
        try {
            Bot bot = new Bot(new EchoMassageHandler());
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(bot);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}
