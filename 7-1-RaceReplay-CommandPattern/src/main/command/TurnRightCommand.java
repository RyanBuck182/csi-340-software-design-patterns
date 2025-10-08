// Ryan Buck
package main.command;

import main.Car;

public class TurnRightCommand implements Command {
    private Car car;

    public TurnRightCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.turnRight();
    }
}
