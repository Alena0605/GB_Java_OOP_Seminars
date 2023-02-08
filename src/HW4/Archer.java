package HW4;

import HW4.Weapons.Bow;

public class Archer extends Warrior {
    public Archer(String name, int hp, Bow bow) {
        super(name, hp, bow);
    }

    @Override
    public String toString() {
        return String.format("Warrior: Archer, %s", super.toString());
    }

    public int shotDistance() {
        return ((Bow) getWeapon()).getDistance();
    }
}
