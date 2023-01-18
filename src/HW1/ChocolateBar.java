package HW1;

public class ChocolateBar extends Bar {
    private TypeSize size;

    public ChocolateBar(String name, double cost, int calories, TypeSize size) {
        super(name, cost, calories);
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
