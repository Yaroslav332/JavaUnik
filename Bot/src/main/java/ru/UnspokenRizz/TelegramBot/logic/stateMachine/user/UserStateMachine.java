package ru.UnspokenRizz.TelegramBot.logic.stateMachine.user;

import ru.UnspokenRizz.TelegramBot.logic.stateMachine.EnumHashedStateMachine;
import ru.UnspokenRizz.TelegramBot.logic.stateMachine.StateMachine;

public class UserStateMachine extends EnumHashedStateMachine<UserStateType, UserState> {
    private final Long UserId;

    public UserStateMachine(Long UserId) {
        this.UserId = UserId;
        hashMap.put(UserStateType.Default, new UserDefaultState(this));
        hashMap.put(UserStateType.InRoom, new UserInRoomState(this));
        Current = UserStateType.Default;
        stateMachine = new StateMachine(hashMap.get(UserStateType.Default));
    }

    public Long getUserId() {
        return UserId;
    }
}
