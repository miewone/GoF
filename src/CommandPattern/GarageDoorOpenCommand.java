package CommandPattern;

/**
 * Created by wgPark on 2023-02-04.
 */
public class GarageDoorOpenCommand  implements Command {
    GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.lightOn();
    }
}
