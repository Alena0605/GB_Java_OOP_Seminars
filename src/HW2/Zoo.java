package HW2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    private Radio radio = new Radio();

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Speakable> getSpeakables() {
        List<Speakable> result = new ArrayList<>(animals);
        result.add(radio);
        return result;
    }

    public List<Runable> getRunner() {
        List<Runable> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Runable) {
                result.add((Runable) animal);
            }
        }
        return result;
    }

    public int getRunnerChampionSpeed() {
        int max = 0;
        for (Runable runner : getRunner()) {
            if (max < runner.speedRun()) {
                max = runner.speedRun();
            }
        }
        return max;
    }

    public List<Flyable> getFlyer() {
        List<Flyable> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public int getFlyerChampionSpeed() {
        int max = 0;
        for (Flyable flyer : getFlyer()) {
            if (max < flyer.speedFlying()) {
                max = flyer.speedFlying();
            }
        }
        return max;
    }

    public List<Swimmable> getSwimmer() {
        List<Swimmable> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimmable) {
                result.add((Swimmable) animal);
            }
        }
        return result;
    }

    public int getSwimmerChampionSpeed() {
        int max = 0;
        for (Swimmable swimmer : getSwimmer()) {
            if (max < swimmer.speedSwimming()) {
                max = swimmer.speedSwimming();
            }
        }
        return max;
    }
}
