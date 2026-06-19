class Device {
    private String deviceName;

    public Device(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void operate() {
        System.out.println(deviceName + " is operating.");
    }
}

class Light extends Device {
    public Light(String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        System.out.println(getDeviceName() + " is turned on.");
    }
}

class Thermostat extends Device {
    private int temperature;

    public Thermostat(String deviceName, int temperature) {
        super(deviceName);
        this.temperature = temperature;
    }

    @Override
    public void operate() {
        System.out.println(getDeviceName() + " is set to " + temperature + "°C.");
    }
}

class SecurityCamera extends Device {
    public SecurityCamera(String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        System.out.println(getDeviceName() + " has started recording.");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Device[] devices = {
            new Light("Living Room Light"),
            new Thermostat("Home Thermostat", 24),
            new SecurityCamera("Front Door Camera")
        };

        for (Device device : devices) {
            device.operate();
        }
    }
}
