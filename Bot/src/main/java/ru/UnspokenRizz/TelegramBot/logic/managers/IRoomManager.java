package ru.UnspokenRizz.TelegramBot.logic.managers;

import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.Room;

public interface IRoomManager {
    Result<Long> createRoom(Long user);
    Result<Room> getRoom(Long Id);
    void deleteRoom(Long user);
}
