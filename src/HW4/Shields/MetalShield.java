package HW4.Shields;

public class MetalShield extends Shield {
    public MetalShield(int armorPoint) {
        super(armorPoint);
    }

    @Override
    public int armor() {
        return armorPoint;
    }

    @Override
    public String toString() {
        return String.format("Damage reduction: %d", armor());
    }
}
