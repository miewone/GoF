package CommandPattern;

/**
 * Created by wgPark on 2023-02-04.
 */
public class RemoteLoader {

    public static void main(String[] args) {
//        RemoteControl remoteControl = new RemoteControl();
//
        Light liveingRoolLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");



        LightOnCommand lightOnKitchenCommand = new LightOnCommand(kitchenLight);
        LightOffCommand lightOffKitchenCommand = new LightOffCommand(kitchenLight);
//
//        CeilingFanOnCommand ceilingFanLivingRoomOnCommand = new CeilingFanOnCommand(ceilingFan);
//
//        GarageDoorOpenCommand garageDoorGarageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
//        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
//
//        StereoOnWithCDCommand stereoOnLivingRoomWithCDCommand = new StereoOnWithCDCommand(stereo);
//
//        remoteControl.setCommand(0, lightOnKitchenCommand,lightOffKitchenCommand);
//        remoteControl.setCommand(1, liveingRoolLight::on,liveingRoolLight::off);
//
//        remoteControl.setCommand(2,ceilingFanLivingRoomOnCommand,ceilingFanLivingRoomOnCommand);
//
//        remoteControl.setCommand(3,garageDoorGarageDoorOpenCommand,garageDoorDownCommand);
//        System.out.println(remoteControl);
//
//        for(int i=0;i< remoteControl.getCommandLength();i++){
//            remoteControl.onButtonWasPushed(i);
//            remoteControl.offButtonWasPushed(i);
//        }
        RemoteControl remoteControl = new RemoteControl();
//        CeilingFan ceilingFan = new CeilingFan("Living");

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command[] commands = {lightOnKitchenCommand,lightOffKitchenCommand};
        MacroCommand macroCommand = new MacroCommand();


        remoteControl.setCommand(0,ceilingFanOnCommand,ceilingFanOnCommand);


    }
}
