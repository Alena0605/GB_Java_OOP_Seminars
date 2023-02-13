package Seminar7.Observer;

// Наблюдатель (ищущий работу) - получает уведомления от JobAgency
public interface Observer {
    void receiveOffer(String nameCompany, int salary);
}
