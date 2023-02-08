package HW4;

import HW4.Shields.Shield;

public abstract class Warrior {
    private String name;
    private int hp;
    public Weaponable weapon;
    public Shieldable shield;

    public Warrior(String name, int hp, Weaponable weapon, Shieldable shield) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        this.shield = shield;
    }

    public Warrior(String name, int hp, Weaponable weapon) {
        this(name, hp, weapon, new Shield(0) {
            @Override
            public int armor() {
                return 0;
            }
        });
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public Weaponable getWeapon() {
        return weapon;
    }

    public Shieldable getShield() {
        return shield;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, hp: %d, Armor: %s -> Attack: %s", name, hp, shield, weapon);
    }
}
