package factories;

import objects.Bike;
import objects.Doll;

public class BikeFactory extends AbstractFactory{
    @Override
    public Bike createBike(String bikeColor) {
        return new Bike(bikeColor);
    }

    @Override
    public Doll createDoll(String hairColor) {
        System.out.println("Bike factory cannot return doll");
        return null;
    }
}
