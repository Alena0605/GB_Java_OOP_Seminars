package Seminar6.HomeWork;

public class RepositoryFile implements Repository {
    @Override
    public void saveUser(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
