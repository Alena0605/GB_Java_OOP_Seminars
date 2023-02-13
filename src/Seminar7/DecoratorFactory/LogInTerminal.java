package Seminar7.DecoratorFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogInTerminal implements Logger {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date = new Date();

    @Override
    public void log(String msg) {
        System.out.println(dateFormat.format(date) + " - " + msg);
    }
}
