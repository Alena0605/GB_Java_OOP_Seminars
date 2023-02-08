package HW4.Shields;
import HW4.Shieldable;

public abstract class Shield implements Shieldable {
    protected int armorPoint;

    public Shield(int armorPoint) {
        this.armorPoint = armorPoint;
    }

    @Override
    public String toString() {
        return "Absent";
    }
}
