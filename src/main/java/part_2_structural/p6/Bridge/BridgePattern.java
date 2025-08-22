package part_2_structural.p6.Bridge;

// The Bridge Design Pattern by GoF.
// To demonstrate the Bridge pattern, this example focuses on creating TV Remote Controls for various brands.
// We have types of TV remotes
// - Basic (on/off only),
// - Advanced (has Basic plus setChannel),
// - Movie (has movie related functionality like play, pause, rewind)
// The Application supports TV Brands like Sony, LG and supports all types of remote controls for each brand.

public class BridgePattern {
    public static void main() {
        System.out.println("========= Bridge Pattern =========");

        // Basic Sony Remote Control
//        RemoteControl remoteControl = new RemoteControl(new SonyTV());
//        remoteControl.turnOn();
//        remoteControl.turnOff();

        // Advanced Sony Remote Control
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(new SonyTV());
        advancedRemoteControl.setChannel(10);

    }
}
