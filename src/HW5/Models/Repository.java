package HW5.Models;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user, String sep);
    void UpdateUser(User user, Fields field, String param);
    void DeleteUser(User user);
}
