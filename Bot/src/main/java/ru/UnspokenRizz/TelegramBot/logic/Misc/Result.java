package ru.UnspokenRizz.TelegramBot.logic.Misc;

public record Result<T>(T result, Exception exception) {
    public boolean Success() {
        return exception==null;
    }
}
