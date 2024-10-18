public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.powerOn();
    }

    @Override
    public void turnOff() {
        device.powerOff();
    }

    @Override
    public void volumeUp() {
        device.setVolume(10);
    }

    @Override
    public void volumeDown() {
        device.setVolume(5);
    }
}
