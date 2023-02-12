package Seminar6.Solid3LSP2;

import Seminar6.Solid3LSP2.lsp.*;

public class Main {
    public static void main(String[] args) {
        FactoryOrder creator = new FactoryOrder();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(3, 2, false));
        calculator.add(creator.create(1, 3, true));

        for (Orderable order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Total order amount: %d", calculator.calcAmount());
    }
}
