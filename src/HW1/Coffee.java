package HW1;

public class Coffee extends HotDrink {
    private TypeCoffee type;

    public Coffee(String name, double cost, TypeSize size, TypeCoffee type) {
        super(name, cost, size);
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s, coffee: %s", super.toString(), type);
    }

    public TypeCoffee getType() {
        return type;
    }
}
