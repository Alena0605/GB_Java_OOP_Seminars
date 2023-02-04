package HW2;

public class Horse extends Animal implements Runable {
    public Horse(String name, int paws) {
        super(name, paws);
    }

    @Override
    public String say() {
        return "neigh";
    }

    @Override
    public String toString() {
        return String.format("Horse, %s", super.toString());
    }

    @Override
    public int speedRun() {
        return 60;
    }
}
