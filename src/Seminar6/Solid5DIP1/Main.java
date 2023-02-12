package Seminar6.Solid5DIP1;

import Seminar6.Solid5DIP1.dip.*;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();

        report.output(new PrintReport());
        System.out.println("==============================");
        report.output(new DisplayReport());
    }
}
