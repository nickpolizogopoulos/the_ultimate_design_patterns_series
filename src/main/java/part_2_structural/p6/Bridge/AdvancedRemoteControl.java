package part_2_structural.p6.Bridge;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int channel) {
        device.setChannel(channel);
    }

}
