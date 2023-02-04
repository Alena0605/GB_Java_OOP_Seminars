package HW2;

public class Bear extends Animal implements Runable, Swimmable {
    public Bear(String name, int paws) {
        super(name, paws);
    }

    @Override
    public String say() {
        return "grrr";
    }

    @Override
    public String toString() {
        return String.format("Bear, %s", super.toString());
    }

    @Override
    public int speedRun() {
        return 50;
    }

    @Override
    public int speedSwimming() {
        return 10;
    }
}
