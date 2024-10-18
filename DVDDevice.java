public class DVDDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("DVD player is on.");
    }

    @Override
    public void powerOff() {
        System.out.println("DVD player is off.");
    }

    @Override
    public void setChannel(int channel) {
        // DVDs don't have channels, so this can be empty or show an error.
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("DVD volume set to: " + volume);
    }
}
