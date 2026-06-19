import java.util.Arrays;

class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayMenuItem() {
        System.out.println("Food: " + name + ", Price: " + price);
    }
}

class Pizza extends FoodItem {
    private String size;
    private String[] toppings;

    public Pizza(String name, double price, String size, String[] toppings) {
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("Pizza: " + getName() + ", Price: " + getPrice() + ", Size: " + size + ", Toppings: " + Arrays.toString(toppings));
    }
}

class Burger extends FoodItem {
    private boolean cheese;
    private String pattyType;

    public Burger(String name, double price, boolean cheese, String pattyType) {
        super(name, price);
        this.cheese = cheese;
        this.pattyType = pattyType;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("Burger: " + getName() + ", Price: " + getPrice() + ", Cheese: " + cheese + ", Patty: " + pattyType);
    }
}

class Salad extends FoodItem {
    private String[] ingredients;

    public Salad(String name, double price, String[] ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("Salad: " + getName() + ", Price: " + getPrice() + ", Ingredients: " + Arrays.toString(ingredients));
    }
}

public class FoodOrderApp {
    public static void main(String[] args) {
        FoodItem[] menu = {
            new Pizza("Cheese Pizza", 900, "Large", new String[]{"Cheese", "Olives"}),
            new Burger("Chicken Burger", 350, true, "Chicken"),
            new Salad("Green Salad", 250, new String[]{"Lettuce", "Tomato", "Cucumber"})
        };

        for (FoodItem item : menu) {
            item.displayMenuItem();
        }
    }
}