package main.drivers;

import main.Serializable;
import main.Storable;
import main.vehicles.Vehicle;

import java.io.IOException;
import java.io.OutputStreamWriter;

public abstract class Driver implements Storable, Serializable {
    public String name;
    public int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
