package ru.UnspokenRizz.TelegramBot;

import ru.UnspokenRizz.TelegramBot.logic.BotRequest;

public interface MessageHandler {
    void handle(BotRequest request, AnswerWriter writer);
}
