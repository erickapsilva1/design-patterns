package command;

import java.util.ArrayList;
import java.util.List;

public class WorkQueue {

    private List<Command> commands;

    public WorkQueue(){
        commands = new ArrayList<Command>();
    }

    public void add(Command command){
        this.commands.add(command);
    }

    public void process(){
        for(Command command : commands){
            command.execute();
        }
    }

}
