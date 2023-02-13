package Seminar7.Adapter;

public class Main {
    // Есть библиотека сбора данных от датчиков. Все они были куплены в комплекте с этой библиотекой.
    // Поступил новый датчик от другой компании, интерфейс которого отличается от предыдущих.
    // Надо включить этот датчик в систему.
    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(2);
        meteoDb.save(ms200_1);

        MeteoSensor st500_1 = new Adapter(new ST500Info().getData());
        meteoDb.save(st500_1);
    }
}
