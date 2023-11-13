package ru.UnspokenRizz.TelegramBot.logic.stateMachine.user;

public class UserInRoomComponent extends UserComponent {

    public Long RoomId = 0L;

    public UserInRoomComponent(Long RoomId) {
        this.RoomId = RoomId;
    }
}
