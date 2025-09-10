package main.drivers;

import java.io.IOException;
import java.io.Writer;

public class CarDriver extends Driver {
    public CarDriver(String name, int age) {
        super(name, age);
    }

    @Override
    public void store() {
        System.out.println("CarDriver has been stored.");
    }

    @Override
    public void serializeToXML(Writer writer) throws IOException {
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

    @Override
    public void serializeToJSON(Writer writer) throws IOException {
        String serializedStr = String.format(
                """
                {
                    "type": "CarDriver",
                    "name": "%s",
                    "age": %d
                }
                """,
                name, age);

        writer.write(serializedStr);
    }
}
