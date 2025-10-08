package main.command;

import main.Car;

public class SlowDownCommand implements Command {
    private Car car;

    public SlowDownCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.slowDown();
    }
}
