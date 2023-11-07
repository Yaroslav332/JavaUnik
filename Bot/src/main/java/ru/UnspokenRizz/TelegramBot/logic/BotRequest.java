package ru.UnspokenRizz.TelegramBot.logic;

public record BotRequest(String Data) {
    public String getData(){
        return Data;
    }
}
