package main.characters;

import main.guitars.Guitar;
import main.soloacts.SoloAct;

public abstract class Character {
    protected String name;
    protected Guitar guitar;
    protected SoloAct soloAct;

    protected Character(String name, Guitar guitar, SoloAct soloAct) {
        this.name = name;
        this.guitar = guitar;
        this.soloAct = soloAct;
    }

    public void playGuitar() {
        System.out.println(name + " " + guitar.play());
    }

    public void playSoloAct() {
        System.out.println(name + " " + soloAct.play());
    }

    public void setGuitar(Guitar guitar) {
        this.guitar = guitar;
    }

    public void setSoloAct(SoloAct soloAct) {
        this.soloAct = soloAct;
    }
}
