package HW1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().contains(name)) {
                System.out.println(product);
            }
        }
    }

    public Product getProductByCost(double cost) {
        for (Product product : products) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }
}
