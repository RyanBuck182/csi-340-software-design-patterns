package main.drivers;

import main.vehicles.Truck;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class TruckDriver extends Driver {
    public TruckDriver(String name, int age) {
        super(name, age);
    }

    public void store() {
        // store the TruckDriver
    }

    public void serializeToXML(OutputStreamWriter writer) throws IOException {
        // serialize to XML
    }

    public void serializeToJSON(OutputStreamWriter writer) throws IOException {
        // serialize to JSON
    }
}
