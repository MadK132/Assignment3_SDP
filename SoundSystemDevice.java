public class SoundSystemDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("Sound system is on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Sound system is off.");
    }

    @Override
    public void setChannel(int channel) {
        // Sound systems don't use channels.
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Sound system volume set to: " + volume);
    }
}
