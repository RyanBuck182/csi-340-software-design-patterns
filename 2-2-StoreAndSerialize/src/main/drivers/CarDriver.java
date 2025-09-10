package main.drivers;

import main.vehicles.Car;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class CarDriver extends Driver {
    public CarDriver(String name, int age) {
        super(name, age);
    }

    public void store() {
        // store the CarDriver
    }

    public void serializeToXML(OutputStreamWriter writer) throws IOException {
        String serializedStr = String.format(
                """
                <CarDriver>
                    <name>%s</name>
                    <age>%d</age>
                </CarDriver>
                """,
                name, age);

        writer.write(serializedStr);
    }

    public void serializeToJSON(OutputStreamWriter writer) throws IOException {
        String serializedStr = String.format(
                """
                {
                    "type": "CarDriver",
                    "name": "%s",
                    "age": %d,
                }
                """,
                name, age);

        writer.write(serializedStr);
    }
}
