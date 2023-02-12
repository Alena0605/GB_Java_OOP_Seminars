package Seminar6.Solid3LSP2.lsp;

public class FactoryOrder {
    public Orderable create(int qnt, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(qnt, price);
        }
        return new BaseOrder(qnt, price);
    }
}
