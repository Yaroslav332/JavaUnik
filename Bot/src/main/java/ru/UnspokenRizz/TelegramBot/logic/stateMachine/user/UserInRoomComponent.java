package ru.UnspokenRizz.TelegramBot.logic.stateMachine.user;

public class UserInRoomComponent extends UserComponent {

    public Long RoomId = 0L;

    public UserInRoomComponent() {

    }

    @Override
    public void Reset(){
        RoomId = 0L;
    }
}
