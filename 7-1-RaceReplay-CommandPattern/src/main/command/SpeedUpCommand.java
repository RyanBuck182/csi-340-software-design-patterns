package main.command;

import main.Car;

public class SpeedUpCommand implements Command {
    private Car car;

    public SpeedUpCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.speedUp();
    }
}
