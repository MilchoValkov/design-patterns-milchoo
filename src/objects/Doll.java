package objects;

public class Doll extends Toy{
    private String hairColor;

    public Doll(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Doll with " + this.hairColor + " hair";
    }
}
