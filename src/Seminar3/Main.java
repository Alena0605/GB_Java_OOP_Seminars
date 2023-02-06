package Seminar3;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        User boss2 = new User("Keanu", "Reeves", 58);
        boss2.addOneSubordinate(new User("Emma", "Watson", 32));

        Personal personal = new Personal();
        personal.addUser(new User("Daniel", "Radcliffe", 33));
        personal.addUser(new User("Henry", "Cavill", 39));
        personal.addUser(boss2);
        personal.addUser(new User("Emma", "Stone", 34));
        personal.addUser(new User("Henry", "Cavill", 40));

        for (User user : personal) {
            System.out.println(user);
        }

        System.out.println("===========================================");

        Collections.sort(personal.getUsers());

        for (User user : personal) {
            System.out.println(user);
        }

        System.out.println("===========================================");

        User bigBoss = new User("Johnny", "Depp", 59);
        bigBoss.addSubordinates(personal);

        System.out.println(bigBoss);
    }
}
