// Ryan Buck
package main.command;

import main.Car;

public class TurnLeftCommand implements Command {
    private Car car;

    public TurnLeftCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.turnLeft();
    }
}
