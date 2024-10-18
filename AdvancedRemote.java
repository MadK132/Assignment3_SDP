public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
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
        device.setVolume(15);
    }

    @Override
    public void volumeDown() {
        device.setVolume(0);
    }

    public void mute() {
        device.setVolume(0);
    }
}
