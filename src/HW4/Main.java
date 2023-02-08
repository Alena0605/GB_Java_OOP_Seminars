package HW4;

import HW4.Shields.MetalShield;
import HW4.Shields.WoodenShield;
import HW4.Weapons.Bow;
import HW4.Weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team<Swordsman> team1 = new Team<>();
        team1.addWarrior(new Swordsman("Arthur", 750, new Sword(70), new WoodenShield(10)))
                .addWarrior(new Swordsman("Artes", 900, new Sword(100), new MetalShield(25)));

        for (Swordsman swordsman : team1) {
            System.out.println(swordsman);
        }

        Team<Archer> team2 = new Team<>();
        team2.addWarrior(new Archer("Legolas", 600, new Bow(80, 200)))
                .addWarrior(new Archer("Aragorn", 750, new Bow(65, 150)));

        for (Archer archer : team2) {
            System.out.println(archer);
        }

        System.out.println("=====================================================================");

        System.out.printf("Max distance for attack in team 1: %d\n", team1.maxDistance());
        System.out.printf("The warrior with the lowest armor in team 1: %d\n", team1.minArmor());
        System.out.printf("Total health points in team 1: %d\n", team1.getAllHealth());
        System.out.printf("Total damage inflicted by team 1: %d\n", team1.getAllDamage());

        System.out.println("=====================================================================");

        System.out.printf("Max distance for attack in team 2: %d\n", team2.maxDistance());
        System.out.printf("The warrior with the lowest armor in team 1: %d\n", team2.minArmor());
        System.out.printf("Total health points in team 2: %d\n", team2.getAllHealth());
        System.out.printf("Total damage inflicted by team 2: %d\n", team2.getAllDamage());
    }
}
