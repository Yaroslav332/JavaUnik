package ru.UnspokenRizz.TelegramBot.logic;

import org.telegram.telegrambots.meta.api.objects.User;

public class Room {
    public Long user;
    public Room(Long user) {
        this.user = user;
    }

    public Long getUser(){
        return this.user;
    }
}