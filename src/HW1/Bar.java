package HW1;

public class Bar extends Product{
    private int calories;

    public Bar(String name, double cost, int calories) {
        super(name, cost);
        this.calories = calories;
    }

    @Override
    public String toString() {
        return String.format("%s, calories: %d", super.toString(), calories);
    }

    public int getCalories() {
        return calories;
    }
}
