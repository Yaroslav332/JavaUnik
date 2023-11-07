package ru.UnspokenRizz.TelegramBot.logic;


public record BotResponse(String Data) {
    public String getData(){
        return Data;
    }
}
