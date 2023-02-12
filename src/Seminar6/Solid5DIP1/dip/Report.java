package Seminar6.Solid5DIP1.dip;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private List<ReportItem> items;    // Отчетные данные

    // Расчет отчетных данных
    public void calculate() {
        items = new ArrayList<>();
        items.add(new ReportItem("First", (float) 5));
        items.add(new ReportItem("Second", (float) 6));
    }

    public void output(Printable report) {
        report.output(items);
    }
}
