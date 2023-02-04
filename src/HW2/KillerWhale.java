package HW2;

public class KillerWhale extends Animal implements Swimmable{
    public KillerWhale(String name, int paws) {
        super(name, paws);
    }

    @Override
    public String say() {
        return "wee-ee-ee";
    }

    @Override
    public String toString() {
        return String.format("Killer whale, %s", super.toString());
    }

    @Override
    public int speedSwimming() {
        return 55;
    }
}
