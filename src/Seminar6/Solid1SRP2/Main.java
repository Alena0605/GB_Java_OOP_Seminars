package Seminar6.Solid1SRP2;

import Seminar6.Solid1SRP2.srp.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter data of order below.");
        Order order = new InputData().inputFromConsole();
        SaveJson filename = new SaveJson("order.json");
        filename.saveToJson(order);
    }
}
