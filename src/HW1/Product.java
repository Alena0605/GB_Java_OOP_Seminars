package HW1;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("name: %s, cost: %.2f", name, cost);
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
