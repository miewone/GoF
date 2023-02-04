package CommandPattern;

/**
 * Created by wgPark on 2023-02-04.
 */
public class NoCommand implements Command {
    Command slot;

    public void setSlot(Command command){
        this.slot = command;
    }
    @Override
    public void execute() {
    }
}
