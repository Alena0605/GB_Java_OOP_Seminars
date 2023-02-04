package HW2;

public class Cat extends Animal implements Runable {
    public Cat(String name, int paws) {
        super(name, paws);
    }

    @Override
    public String say() {
        return "meow";
    }

    @Override
    public String toString() {
        return String.format("Cat, %s", super.toString());
    }

    @Override
    public int speedRun() {
        return 15;
    }
}
