package objects;

import factories.BikeFactory;
import factories.DollFactory;
import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Dwarf implements Observer {
    private String dwarfName;
    private Observable board;
    private List<Toy> toysCreated;

    public Dwarf(String dwarfName) {
        this.dwarfName = dwarfName;
        this.toysCreated = new ArrayList<>();
    }

    @Override
    public void update() {
        Toy toy;
        String toyNeeded = this.board.getToyNeeded();
        if (toyNeeded == "BIKE") {
            System.out.println(this.dwarfName + " is creating bike");
            toy = new BikeFactory().createBike("black");
        } else if (toyNeeded == "DOLL") {
            System.out.println(this.dwarfName + " is creating doll");
            toy = new DollFactory().createDoll("red");
        } else {
            toy = null;
        }

        if (toy != null) {
            this.toysCreated.add(toy);
        }
    }

    @Override
    public void setBoard(Observable board) {
        this.board = board;
    }

    public void listToys() {
        System.out.println("Dwarf with name: " + this.dwarfName
                + " has created " + this.toysCreated.size() + " toys:");
        for (Toy toy :
                this.toysCreated) {
            System.out.println(toy.toString());
        }
    }
}
