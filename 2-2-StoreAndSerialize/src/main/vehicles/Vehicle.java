package main.vehicles;

import main.Serializable;
import main.Storable;

public abstract class Vehicle implements Storable, Serializable {
    public String make;
    public String model;
    public int vin;

    public Vehicle(String make, String model, int vin) {
        this.make = make;
        this.model = model;
        this.vin = vin;
    }
}
