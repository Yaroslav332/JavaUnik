package ru.UnspokenRizz.TelegramBot;

import org.apache.commons.lang3.NotImplementedException;
import ru.UnspokenRizz.TelegramBot.logic.Room;

import java.util.HashMap;

public class RoomController {
    HashMap<Long, Room> RoomContainer = new HashMap<>();
    public Room createRoom(Long user) throws Exception {
        if (RoomContainer.containsKey(user)){
            throw new Exception("Room already exists");
        }
        else {
            Room room = new Room(user);
            RoomContainer.put(user, room);
            return room;
        }
    };
    public void deleteRoom(Long user) throws Exception {
        if (!RoomContainer.containsKey(user)){
            throw new Exception("Room not exists");
        }
        else {
            RoomContainer.remove(user);
        }
    }

    private Long generateRoomId(){
        throw new NotImplementedException();
        //TODO
    }
}
