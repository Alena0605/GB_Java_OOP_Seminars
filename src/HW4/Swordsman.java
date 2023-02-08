package HW4;

import HW4.Shields.Shield;
import HW4.Weapons.Sword;

public class Swordsman extends Warrior {
    public Swordsman(String name, int hp, Sword sword, Shield shield) {
        super(name, hp, sword, shield);
    }

    @Override
    public String toString() {
        return String.format("Warrior: Swordsman, %s", super.toString());
    }
}
