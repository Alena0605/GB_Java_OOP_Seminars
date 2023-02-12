package Seminar6.Solid3LSP2.lsp;

public abstract class Order implements Orderable {
    protected final int price;
    protected final int qnt;

    public Order(int qnt, int price) {
        this.qnt = qnt;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getQnt() {
        return qnt;
    }

    @Override
    public String toString() {
        return String.format("Quantity = %d, Price = %d", qnt, price);
    }
}
