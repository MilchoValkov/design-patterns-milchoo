package command;

import objects.Board;

public class INeedDollCommand implements Command {
    private Board board;

    public INeedDollCommand(Board board) {
        this.board = board;
    }

    @Override
    public void execute() {
        System.out.println("Santa claus says: I NEED DOLL");
        this.board.setToyNeeded("DOLL");
    }
}
