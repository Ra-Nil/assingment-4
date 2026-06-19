class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

class Electronics extends Product {
    private int warrantyPeriod;

    public Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + getName() + ", Price: " + getPrice() + ", Warranty: " + warrantyPeriod + " months");
    }
}

class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Clothing: " + getName() + ", Price: " + getPrice() + ", Size: " + size + ", Material: " + material);
    }
}

class Grocery extends Product {
    private String expiryDate;

    public Grocery(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Grocery: " + getName() + ", Price: " + getPrice() + ", Expiry Date: " + expiryDate);
    }
}

public class ProductCatalog {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics("Laptop", 80000, 24),
            new Clothing("T-Shirt", 1200, "M", "Cotton"),
            new Grocery("Milk", 150, "2026-07-01")
        };

        for (Product product : products) {
            product.displayDetails();
        }
    }
}
