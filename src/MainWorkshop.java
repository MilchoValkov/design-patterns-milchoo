import command.INeedBikeCommand;
import command.INeedDollCommand;
import objects.Board;
import objects.Dwarf;
import objects.SantaClaus;

import java.util.ArrayList;
import java.util.List;

public class MainWorkshop {
    public static void main(String[] args) {
        SantaClaus santa = SantaClaus.getInstance();
        Board board = new Board();
        Dwarf dwarf1 = new Dwarf("Grumpy");
        Dwarf dwarf2 = new Dwarf("Ballin");
        Dwarf dwarf3 = new Dwarf("Thorin");
        List<Dwarf> dwarfs = new ArrayList<Dwarf>();
        dwarfs.add(dwarf1);
        dwarfs.add(dwarf2);
        dwarfs.add(dwarf3);
        INeedBikeCommand bikeCommand = new INeedBikeCommand(board);
        INeedDollCommand dollCommand = new INeedDollCommand(board);

        board.subscribe(dwarf1);
        board.subscribe(dwarf2);
        board.subscribe(dwarf3);

        santa.setCommand(bikeCommand);
        santa.sayWords();
        santa.setCommand(dollCommand);
        santa.sayWords();

        board.unsubscribe(dwarf2);
        santa.setCommand(dollCommand);
        santa.sayWords();

        for (Dwarf dwarf :
                dwarfs) {
            dwarf.listToys();
        }
    }
}
