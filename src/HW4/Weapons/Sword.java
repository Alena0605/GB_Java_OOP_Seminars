package HW4.Weapons;

import java.util.Random;

public class Sword extends Weapon {
    public Sword(int damagePoint) {
        super(damagePoint);
    }

    @Override
    public int damage() {
        return damagePoint;
    }

    @Override
    public String toString() {
        return String.format("Sword damage -> %d", damage());
    }
}
