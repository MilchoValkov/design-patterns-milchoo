package command;

import objects.Board;

public class INeedBikeCommand implements Command {
    private Board board;

    public INeedBikeCommand(Board board) {
        this.board = board;
    }

    @Override
    public void execute() {
        System.out.println("Santa claus says: I NEED BIKE");
        this.board.setToyNeeded("BIKE");
    }
}
