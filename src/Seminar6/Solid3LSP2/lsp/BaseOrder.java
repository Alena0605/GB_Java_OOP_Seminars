package Seminar6.Solid3LSP2.lsp;

public class BaseOrder extends Order {
    public BaseOrder(int qnt, int price) {
        super(qnt, price);
    }

    @Override
    public int getAmount() {
        return qnt * price;
    }
}
