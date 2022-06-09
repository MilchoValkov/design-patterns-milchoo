package objects;

public class Bike extends Toy{
    private String bikeColor;

    public Bike(String bikeColor) {
        this.bikeColor = bikeColor;
    }


    @Override
    public String toString() {
        return "Bike with " + this.bikeColor + " color";
    }
}
