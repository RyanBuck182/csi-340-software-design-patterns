package main.vehicles;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Car extends Vehicle {
    public Car(String make, String model, int vin) {
        super(make, model, vin);
    }

    public void store() {
        // store the Car
    }

    public void serializeToXML(OutputStreamWriter writer) throws IOException {
        // serialize to XML
    }

    public void serializeToJSON(OutputStreamWriter writer) throws IOException {
        // serialize to JSON
    }
}
