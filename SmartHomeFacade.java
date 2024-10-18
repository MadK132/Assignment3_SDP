public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Light light, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.light = light;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome() {
        securitySystem.arm();
        light.off();
        thermostat.setTemperature(18);
        System.out.println("Home is ready for leaving.");
    }

    public void arriveHome() {
        securitySystem.disarm();
        light.on();
        thermostat.setTemperature(22);
        System.out.println("Welcome home!");
    }

    public void nightMode() {
        light.off();
        thermostat.setTemperature(20);
        securitySystem.arm();
        System.out.println("Night mode activated.");
    }

    public void movieMode() {
        light.off();
        entertainmentSystem.playMovie();
        System.out.println("Movie mode activated.");
    }
}
