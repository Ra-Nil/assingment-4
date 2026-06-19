class Vehicle {
    private String plateNumber;
    private double baseRate;

    public Vehicle(String plateNumber, double baseRate) {
        this.plateNumber = plateNumber;
        this.baseRate = baseRate;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public double calculateRental(int days) {
        return baseRate * days;
    }
}

class Car extends Vehicle {
    public Car(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }

    @Override
    public double calculateRental(int days) {
        return getBaseRate() * days;
    }
}

class Truck extends Vehicle {
    private double loadFee;

    public Truck(String plateNumber, double baseRate, double loadFee) {
        super(plateNumber, baseRate);
        this.loadFee = loadFee;
    }

    @Override
    public double calculateRental(int days) {
        return getBaseRate() * days + loadFee;
    }
}

class Bike extends Vehicle {
    public Bike(String plateNumber, double fixedRate) {
        super(plateNumber, fixedRate);
    }

    @Override
    public double calculateRental(int days) {
        return getBaseRate();
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR-101", 2000),
            new Truck("TRUCK-202", 5000, 3000),
            new Bike("BIKE-303", 1000)
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getPlateNumber() + " Rent: " + vehicle.calculateRental(3));
        }
    }
}
