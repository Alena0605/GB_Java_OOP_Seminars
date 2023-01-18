package HW1;

public class Milk extends Product {
    private double fatMilk;
    private TypeMilk typeOfMilk;

    public Milk(String name, double cost, double fatMilk, TypeMilk typeOfMilk) {
        super(name, cost);
        this.fatMilk = fatMilk;
        this.typeOfMilk = typeOfMilk;
    }

    @Override
    public String toString() {
        return String.format("%s, fat milk: %.1f, type of milk: %s", super.toString(), fatMilk, typeOfMilk);
    }

    public double getFatMilk() {
        return fatMilk;
    }

    public TypeMilk getTypeOfMilk() {
        return typeOfMilk;
    }
}
