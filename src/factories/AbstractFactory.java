package factories;

import objects.Bike;
import objects.Doll;

public abstract class AbstractFactory {
    public abstract Bike createBike(String bikeColor);
    public abstract Doll createDoll(String hairColor);
}
