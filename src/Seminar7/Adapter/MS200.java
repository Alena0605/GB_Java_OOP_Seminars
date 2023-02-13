package Seminar7.Adapter;

import java.time.LocalDateTime;

public class MS200 implements MeteoSensor {
    int id;

    public MS200(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Float getTemperature() {
        return (float) 20;
    }

    @Override
    public Float getHumidity() {
        return (float) 60;
    }

    @Override
    public Float getPressure() {
        return (float) 752.4;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
