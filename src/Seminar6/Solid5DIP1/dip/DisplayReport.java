package Seminar6.Solid5DIP1.dip;

import java.util.List;

public class DisplayReport implements Printable {
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to file");
        for (ReportItem item : items) {
            System.out.format("Printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
