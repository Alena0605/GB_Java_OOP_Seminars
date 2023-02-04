package HW2;

public class Dolphin extends Animal implements Swimmable{
    public Dolphin(String name, int paws) {
        super(name, paws);
    }

    @Override
    public String say() {
        return "click";
    }

    @Override
    public String toString() {
        return String.format("Dolphin, %s", super.toString());
    }

    @Override
    public int speedSwimming() {
        return 28;
    }
}
