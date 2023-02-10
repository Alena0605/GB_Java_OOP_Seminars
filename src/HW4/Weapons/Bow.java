package HW4.Weapons;

import java.util.Random;

public class Bow extends Weapon {
    private int distance;

    public Bow(int damagePoint, int distance) {
        super(damagePoint);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int damage() {
        return damagePoint;
    }

    @Override
    public String toString() {
        return String.format("Bow damage -> %d, Attack distance -> %d", damage(), distance);
    }
}
