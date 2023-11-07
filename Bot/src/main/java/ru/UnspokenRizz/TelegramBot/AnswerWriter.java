package ru.UnspokenRizz.TelegramBot;

import ru.UnspokenRizz.TelegramBot.logic.BotResponse;

public interface AnswerWriter {
    void writeAnswer(BotResponse response);
}