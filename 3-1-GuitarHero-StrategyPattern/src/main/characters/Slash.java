// Ryan Buck
package main.characters;

import main.guitars.FenderTelecaster;
import main.soloacts.GuitarFire;

public class Slash extends Character {
    public Slash() {
        super("Slash", new FenderTelecaster(), new GuitarFire());
    }
}
