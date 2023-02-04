package HW2;

public class Owl extends Animal implements Runable, Flyable{
    public Owl(String name, int paws) {
        super(name, paws);
    }

    @Override
    public String say() {
        return "whoo";
    }

    @Override
    public String toString() {
        return String.format("Owl, %s", super.toString());
    }

    @Override
    public int speedFlying() {
        return 80;
    }

    @Override
    public int speedRun() {
        return 2;
    }
}
