package Seminar6.Solid1SRP1.srp;

public class SquareView {
    private final int side;

    public SquareView(int side) {
        this.side = side;
    }

    public void draw(int zoom) {
        int length = side * zoom;

        for (int i = 0; i < length; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < length - 2; i++) {
            System.out.print("* ");
            for (int j = 1; j < length - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
        for (int i = 0; i < length; i++) {
            System.out.print("* ");
        }
    }
}
