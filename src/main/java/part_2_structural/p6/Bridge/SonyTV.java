package part_2_structural.p6.Bridge;

public class SonyTV implements Device {

    @Override
    public void turnOn() {
        System.out.println("Sony: Turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Turning off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: Setting channel to " + number);
    }
}
