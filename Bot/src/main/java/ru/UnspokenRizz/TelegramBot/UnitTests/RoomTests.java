package ru.UnspokenRizz.TelegramBot.UnitTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.UnspokenRizz.TelegramBot.logic.Room;

import java.util.Optional;


public class RoomTests extends Assert {
    @Test
    static void createRoom(){
        Room room = new Room(1L);
        assertEquals(room.getUser(), (Long) 1L);
    }
}
