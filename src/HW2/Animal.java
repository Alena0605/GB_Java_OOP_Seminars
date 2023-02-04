package HW2;

public abstract class Animal implements Speakable {
    private String name;
    private int paws;

    public Animal(String name, int paws) {
        this.name = name;
        this.paws = paws;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, paws num: %d", name, paws);
    }

    public abstract String say();
}
