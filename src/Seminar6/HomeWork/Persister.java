package Seminar6.HomeWork;

public class Persister implements Reportable {
    private final User user;

    public Persister(User user) {
        this.user = user;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
