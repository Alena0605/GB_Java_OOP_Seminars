package Seminar6.Solid3LSP2.lsp;

public class OrderBonus extends Order{
    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    }

    @Override
    public int getAmount() {
        return 0;
    }
}
