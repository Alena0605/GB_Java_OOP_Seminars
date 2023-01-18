package HW1;

public class Main {
    public static void main(String[] args) {
        VendingMachine vending = new VendingMachine();
        Product prod1 = new Product("greenApple", 15);
        Product prod2 = new Product("redApple", 12);
        Product prod3 = new Product("orange", 8);
        Product prod4 = new Bar("Protein bar", 80, 100);
        Product prod5 = new ChocolateBar("Snickers", 45, 240, TypeSize.SMALL);
        Product prod6 = new Milk("Prostokvashino", 87, 2.5, TypeMilk.PASTEURISED);
        Product prod7 = new Milk("Prostokvashino", 100, 3.4, TypeMilk.PASTEURISED);
        Product prod8 = new HotDrink("Black tea", 80, TypeSize.MIDDLE);
        Product prod9 = new Coffee("Coffee", 200, TypeSize.MIDDLE, TypeCoffee.LATTE);
        Product prod10 = new Coffee("Coffee", 300, TypeSize.BIG, TypeCoffee.CAPPUCCINO);

        vending.addProduct(prod1);
        vending.addProduct(prod2);
        vending.addProduct(prod3);
        vending.addProduct(prod4);
        vending.addProduct(prod5);
        vending.addProduct(prod6);
        vending.addProduct(prod7);
        vending.addProduct(prod8);
        vending.addProduct(prod9);
        vending.addProduct(prod10);

        for (Product product : vending.getProducts()) {
            System.out.println(product);
        }

        System.out.println("============================================================");

        System.out.println("product 6 - " + prod6.getName());
        System.out.println("product 6 - " + prod6.getCost());

        vending.getProductByName("Prostokvashino");
        vending.getProductByName("Milk");
        vending.getProductByName("Coffee");
    }
}
