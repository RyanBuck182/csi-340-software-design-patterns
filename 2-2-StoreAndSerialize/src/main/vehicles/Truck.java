package main.vehicles;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Truck extends Vehicle {
    public Truck(String make, String model, int vin) {
        super(make, model, vin);
    }

    public void store() {
        // store the Truck
    }

    public void serializeToXML(OutputStreamWriter writer) throws IOException {
        String serializedStr = String.format(
                """
                <Truck>
                    <make>%s</make>
                    <model>%s</model>
                    <vin>%s</vin>
                </Truck>
                """,
                make, model, vin);

        writer.write(serializedStr);
    }

    public void serializeToJSON(OutputStreamWriter writer) {
        // serialize to JSON
    }
}