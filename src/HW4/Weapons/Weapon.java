package HW4.Weapons;
import HW4.Weaponable;

public abstract class Weapon implements Weaponable {
    protected int damagePoint;

    public Weapon(int damagePoint) {
        this.damagePoint = damagePoint;
    }
}
