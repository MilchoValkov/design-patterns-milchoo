package factories;

import objects.Bike;
import objects.Doll;

public class DollFactory extends AbstractFactory {
    @Override
    public Bike createBike(String bikeColor) {
        System.out.println("Doll factory cannot return bike");
        return null;
    }

    @Override
    public Doll createDoll(String hairColor) {
        return new Doll(hairColor);
    }
}
