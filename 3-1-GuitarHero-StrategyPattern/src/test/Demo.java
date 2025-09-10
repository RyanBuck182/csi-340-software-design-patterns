// Ryan Buck
package test;

import main.characters.*;
import main.characters.Character;
import main.guitars.*;
import main.soloacts.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Creating characters...");
        Character player1 = new Slash();
        Character player2 = new JimiHendrix();
        Character player3 = new AngusYoung();

        System.out.println("\nTesting guitars...");
        player1.playGuitar();
        player2.playGuitar();
        player3.playGuitar();

        System.out.println("\nTesting solo acts...");
        player1.playSoloAct();
        player2.playSoloAct();
        player3.playSoloAct();

        System.out.println("\nTesting guitar change...");
        player1.playGuitar();
        player1.setGuitar(new GibsonFlyingV());
        player1.playGuitar();
        player1.setGuitar(new GibsonSG());
        player1.playGuitar();

        System.out.println("\nTesting solo act change...");
        player1.playSoloAct();
        player1.setSoloAct(new GuitarSmash());
        player1.playSoloAct();
        player1.setSoloAct(new StageJump());
        player1.playSoloAct();
    }
}
