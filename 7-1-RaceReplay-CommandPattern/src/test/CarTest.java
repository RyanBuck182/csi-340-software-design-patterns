// Ryan Buck
package test;

import main.Car;
import main.CarGame;
import main.command.*;

public class CarTest {

    public static void main(String[] args) {
        CarGame carGame = new CarGame();
        Car car = new Car();

        TurnLeftCommand turnLeft = new TurnLeftCommand(car);
        TurnRightCommand turnRight = new TurnRightCommand(car);
        SpeedUpCommand speedUp = new SpeedUpCommand(car);
        SlowDownCommand slowDown = new SlowDownCommand(car);

        carGame.performRecordCommand(turnLeft);
        carGame.performRecordCommand(speedUp);
        carGame.performRecordCommand(slowDown);
        carGame.performRecordCommand(turnRight);

        System.out.println("REPLAY");
        carGame.replay();
    }
}
