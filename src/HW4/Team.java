package HW4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<E extends Warrior> implements Iterable<E> {
    private List<E> team = new ArrayList<>();

    public Team<E> addWarrior(E warrior) {
        team.add(warrior);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }

    public int maxDistance() {
        int maxDist = 0;
        for (E warrior : team) {
            if (warrior instanceof Archer) {
                if (((Archer) warrior).shotDistance() > maxDist) {
                    maxDist = ((Archer) warrior).shotDistance();
                }
            }
        }
        return maxDist;
    }

    public int minArmor() {
        int minArm = team.get(0).getShield().armor();
        for (E warrior : team) {
            if (warrior.getShield().armor() < minArm) {
                minArm = warrior.getShield().armor();
            }
        }
        return minArm;
    }

    public int getAllDamage() {
        int allDamage = 0;
        for (E warrior : team) {
            allDamage += warrior.getWeapon().damage();
        }
        return allDamage;
    }

    public int getAllHealth() {
        int allHealth = 0;
        for (E warrior : team) {
            allHealth += warrior.getHp();
        }
        return allHealth;
    }
}
