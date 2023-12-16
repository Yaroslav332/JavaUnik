package ru.UnspokenRizz.TelegramBot.logic.managers;

import org.apache.commons.lang3.NotImplementedException;
import ru.UnspokenRizz.TelegramBot.logic.Misc.Result;
import ru.UnspokenRizz.TelegramBot.logic.Room;

import java.util.HashMap;

public class DefaultRoomManager implements RoomManager {
    public DefaultRoomManager(){

    }
    HashMap<Long, Room> RoomContainer = new HashMap<>();

    @Override
    public Result<Long> createRoom(Long user){
        if (RoomContainer.containsKey(user)){
            return new Result<>(0L, new Exception("Room already exists"));
        }
        else {
            Room room = new Room(user);
            RoomContainer.put(user, room);
            return new Result<>(user, null);
        }
    }

    @Override
    public Result<Room> getRoom(Long user){
        if (!RoomContainer.containsKey(user)){
            return new Result<>(null, new Exception("Room does not exist"));
        }
        return new Result<>(RoomContainer.get(user), null);
    }

    @Override
    public void deleteRoom(Long user){
        if (RoomContainer.containsKey(user)){
            RoomContainer.remove(user);
        }
    }

    private Long generateRoomId(){
        throw new NotImplementedException();
        //TODO
    }
}
