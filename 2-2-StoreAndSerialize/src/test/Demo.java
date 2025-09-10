package test;

import main.Serializable;
import main.Storable;
import main.drivers.CarDriver;
import main.drivers.TruckDriver;
import main.vehicles.Car;
import main.vehicles.Truck;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws IOException {
        // Create demo objects
        System.out.println("Creating objects...");
        Car car = new Car("Honda", "Civic", 1234);
        Truck truck = new Truck("Ford", "F150", 4321);
        CarDriver carDriver = new CarDriver("Dave", 33);
        TruckDriver truckDriver = new TruckDriver("Jane", 52);

        // Store demo objects
        System.out.println("Adding objects to Storable list...");
        ArrayList<Storable> storableList = new ArrayList<Storable>();
        storableList.add(car);
        storableList.add(truck);
        storableList.add(carDriver);
        storableList.add(truckDriver);

        System.out.println("Storing objects in list...");
        for (int i = 0; i < storableList.size(); i++) {
            storableList.get(i).store();
        }

        // Serialize demo objects
        System.out.println("Adding objects to Serializable list...");
        ArrayList<Serializable> serializableList = new ArrayList<Serializable>();
        serializableList.add(car);
        serializableList.add(truck);
        serializableList.add(carDriver);
        serializableList.add(truckDriver);

        System.out.println("Serializing objects in list...");
        Writer writer = new OutputStreamWriter(System.out);
        for (int i = 0; i < serializableList.size(); i++) {
            serializableList.get(i).serializeToXML(writer);
            serializableList.get(i).serializeToJSON(writer);
        }
        writer.close();
    }
}
