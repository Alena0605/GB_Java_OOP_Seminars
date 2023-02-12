package Seminar6.HomeWork;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alena");
        Repository repository = new RepositoryFile();
        repository.saveUser(user);
        Persister persister = new Persister(user);
        persister.report();
    }
}
