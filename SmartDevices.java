class SmartDevice {
    String brand;
    String model;

    SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void turnOn() {
        System.out.println("Smart Device is turning on.");
    }

    void turnOff() {
        System.out.println("Smart Device is turning off.");
    }
}

class SmartPhone extends SmartDevice {

    SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    void turnOn() {
        System.out.println("SmartPhone " + brand + " " + model + " is turning on.");
    }

    @Override
    void turnOff() {
        System.out.println("SmartPhone " + brand + " " + model + " is turning off.");
    }
}

class SmartWatch extends SmartDevice {

    SmartWatch(String brand, String model) {
        super(brand, model);
    }

    @Override
    void turnOn() {
        System.out.println("SmartWatch " + brand + " " + model + " is turning on.");
    }

    @Override
    void turnOff() {
        System.out.println("SmartWatch " + brand + " " + model + " is turning off.");
    }
}

public class SmartDevices {
    public static void main(String[] args) {

        // Runtime Polymorphism
        SmartDevice device1 = new SmartPhone("Samsung", "Galaxy S25");
        SmartDevice device2 = new SmartWatch("Apple", "Watch Series 10");

        device1.turnOn();
        device1.turnOff();

        System.out.println();

        device2.turnOn();
        device2.turnOff();
    }
}