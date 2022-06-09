package objects;

import command.Command;

public class SantaClaus {
    private static SantaClaus instance;
    private Command command;


    private SantaClaus() {}

    public static SantaClaus getInstance(){
        if(instance==null){
            instance = new SantaClaus();
        }

        return instance;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void sayWords(){
        this.command.execute();
    }
}
