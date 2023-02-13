package Seminar7.Observer;

// Это интерфейс рассылки предложений наблюдателям
// Он может регистрировать наблюдателей, удалять их, и рассылать им сообщения
public interface Publisher {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String nameCompany, int salary);
}
