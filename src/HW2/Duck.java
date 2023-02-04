package HW2;

public class Duck extends Animal implements Runable, Flyable, Swimmable {
    public Duck(String name, int paws) {
        super(name, paws);
    }

    @Override
    public String say() {
        return "quack";
    }

    @Override
    public String toString() {
        return String.format("Duck, %s", super.toString());
    }

    @Override
    public int speedRun() {
        return 5;
    }

    @Override
    public int speedFlying() {
        return 100;
    }

    @Override
    public int speedSwimming() {
        return 1;
    }
}
