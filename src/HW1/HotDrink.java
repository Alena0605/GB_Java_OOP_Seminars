package HW1;

public class HotDrink extends Product{
    private TypeSize size;

    public HotDrink(String name, double cost, TypeSize size) {
        super(name, cost);
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("%s, size: %s", super.toString(), size);
    }

    public TypeSize getSize() {
        return size;
    }
}
