package main.drivers;

import java.io.IOException;
import java.io.Writer;

public class TruckDriver extends Driver {
    public TruckDriver(String name, int age) {
        super(name, age);
    }

    @Override
    public void store() {
        System.out.println("TruckDriver has been stored.");
    }

    @Override
    public void serializeToXML(Writer writer) throws IOException {
        String serializedStr = String.format(
                """
                <TruckDriver>
                    <name>%s</name>
                    <age>%d</age>
                </TruckDriver>
                """,
                name, age);

        writer.write(serializedStr);
    }

    @Override
    public void serializeToJSON(Writer writer) throws IOException {
        String serializedStr = String.format(
                """
                {
                    "type": "TruckDriver",
                    "name": "%s",
                    "age": %d
                }
                """,
                name, age);

        writer.write(serializedStr);
    }
}
