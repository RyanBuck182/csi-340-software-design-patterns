package main.drivers;

import main.Serializable;
import main.Storable;

public abstract class Driver implements Storable, Serializable {
    public String name;
    public int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
