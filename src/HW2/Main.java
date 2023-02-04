package HW2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Bublik", 4));
        zoo.addAnimal(new Dog("Fluffy", 4));
        zoo.addAnimal(new Horse("Spirit", 4));
        zoo.addAnimal(new Duck("Donald", 2));
        zoo.addAnimal(new Owl("Bookly", 2));
        zoo.addAnimal(new Dolphin("Betty", 0));
        zoo.addAnimal(new KillerWhale("Swallow", 0));
        zoo.addAnimal(new Bear("Toptyzhka", 4));

        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal);
            System.out.println(animal.say());
        }

        System.out.println("=========================================================");

        for (Speakable speak : zoo.getSpeakables()) {
            System.out.println(speak.say());
        }

        System.out.println("=========================================================");

        System.out.println("Runners' speed:");
        for (Runable runner : zoo.getRunner()) {
            System.out.println(runner.getClass().getSimpleName() + ": " + runner.speedRun());
        }

        System.out.println("Champion's speed among runners: " + zoo.getRunnerChampionSpeed());

        System.out.println("=========================================================");

        System.out.println("Flyers' speed:");
        for (Flyable flyer : zoo.getFlyer()) {
            System.out.println(flyer.getClass().getSimpleName() + ": " + flyer.speedFlying());
        }

        System.out.println("Champion's speed among flyers: " + zoo.getFlyerChampionSpeed());

        System.out.println("=========================================================");

        System.out.println("Swimmers' speed:");
        for (Swimmable swimmer : zoo.getSwimmer()) {
            System.out.println(swimmer.getClass().getSimpleName() + ": " + swimmer.speedSwimming());
        }

        System.out.println("Champion's speed among swimmers: " + zoo.getSwimmerChampionSpeed());
    }
}
