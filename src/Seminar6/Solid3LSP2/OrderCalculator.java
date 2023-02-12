package Seminar6.Solid3LSP2;

import Seminar6.Solid3LSP2.lsp.Orderable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderCalculator implements Iterable<Orderable> {
    private final List<Orderable> orders = new ArrayList<>();

    public void add(Orderable order) {
        orders.add(order);
    }

    public int calcAmount() {
        int sum = 0;
        for (Orderable order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<Orderable> iterator() {
        return orders.iterator();
    }
}
