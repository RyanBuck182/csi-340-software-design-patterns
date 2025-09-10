package main.vehicles;

import java.io.IOException;
import java.io.Writer;

public class Car extends Vehicle {
    public Car(String make, String model, int vin) {
        super(make, model, vin);
    }

    public void store() {
        System.out.println("Car has been stored.");
    }

    public void serializeToXML(Writer writer) throws IOException {
        String serializedStr = String.format(
                """
                <Car>
                    <make>%s</make>
                    <model>%s</model>
                    <vin>%s</vin>
                </Car>
                """,
                make, model, vin);

        writer.write(serializedStr);
    }

    public void serializeToJSON(Writer writer) throws IOException {
        String serializedStr = String.format(
                """
                {
                    "type": "Car",
                    "make": "%s",
                    "model": "%s",
                    "vin": %d,
                }
                """,
                make, model, vin);

        writer.write(serializedStr);
    }
}
