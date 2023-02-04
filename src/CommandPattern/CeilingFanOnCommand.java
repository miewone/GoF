package CommandPattern;

/**
 * Created by wgPark on 2023-02-04.
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.low();
    }


    public void undo() {
        ceilingFan.high();
    }
}
