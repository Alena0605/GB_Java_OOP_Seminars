package Seminar6.Solid1SRP1;

import Seminar6.Solid1SRP1.srp.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Площадь фигуры: %d\n", square.getArea());
        SquareView squareView = new SquareView(5);
        squareView.draw(2);
    }
}
