package Seminar7.Adapter;

import java.time.LocalDateTime;

public class Adapter implements MeteoSensor {
    SensorTemperature sensorTemp;

    public Adapter(SensorTemperature sensorTemp) {
        this.sensorTemp = sensorTemp;
    }

    @Override
    public int getId() {
        return sensorTemp.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) sensorTemp.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime date = LocalDateTime.of(sensorTemp.year(), 1, 1, 0, 0);
        date = date.plusDays(sensorTemp.day() - 1);
        date = date.plusSeconds(sensorTemp.second());
        return date;
    }
}
