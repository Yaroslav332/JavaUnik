package ru.UnspokenRizz.TelegramBot.console;

import ru.UnspokenRizz.TelegramBot.AnswerWriter;
import ru.UnspokenRizz.TelegramBot.logic.BotResponse;

public class ConsoleAnswerWriter implements AnswerWriter {
    @Override
    public void writeAnswer(BotResponse response) {
        System.out.println(response.Data());
    }
}