// Ryan Buck
package main;

import main.command.Command;

import java.util.LinkedList;
import java.util.List;

public class CarGame {
    List<Command> commandHistory;

    public CarGame() {
        commandHistory = new LinkedList<>();
    }

    public void performRecordCommand(Command command) {
        commandHistory.add(command);
        command.execute();
    }

    public void replay() {
        for (Command command : commandHistory) {
            command.execute();
        }
    }
}
