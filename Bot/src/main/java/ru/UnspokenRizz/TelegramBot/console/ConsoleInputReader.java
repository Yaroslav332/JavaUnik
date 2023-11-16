package ru.UnspokenRizz.TelegramBot.console;

import ru.UnspokenRizz.TelegramBot.InputReader;
import ru.UnspokenRizz.TelegramBot.logic.BotRequest;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    Scanner scanner = new Scanner(System.in);
    @Override
    public BotRequest getUserInput() {
        return new BotRequest(scanner.nextLine(), 0L);
    }
}
