package HW2;

public class Dog extends Animal implements Runable {
    public Dog(String name, int paws) {
        super(name, paws);
    }

    @Override
    public String say() {
        return "woof";
    }

    @Override
    public String toString() {
        return String.format("Dog, %s", super.toString());
    }

    @Override
    public int speedRun() {
        return 20;
    }
}
