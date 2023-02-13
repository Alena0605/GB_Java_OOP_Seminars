package Seminar6.HW6_7.Logging;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogIntoCSV implements Logger {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date = new Date();

    @Override
    public void saveCSV(String msg) {
        try (FileWriter writer = new FileWriter("log.csv", true)) {
            writer.write(String.format("%s - %s\n", dateFormat.format(date), msg));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
