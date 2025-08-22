package part_2_structural.p6.Bridge;

public class LGTV implements Device {

    @Override
    public void turnOn() {
        System.out.println("LG: Turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("LG: Turning off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("LG: Setting channel to " + number);
    }
}
