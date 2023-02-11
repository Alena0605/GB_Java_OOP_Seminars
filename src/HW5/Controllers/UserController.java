package HW5.Controllers;

import HW5.Models.Fields;
import HW5.Models.Repository;
import HW5.Models.User;

import java.util.List;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user, String sep) {
        repository.CreateUser(user, sep);
    }

    public void changeUser(User user, Fields field, String param) {
        repository.UpdateUser(user, field, param);
    }

    public void removeUser(User user) {
        repository.DeleteUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }

    public List<User> readAllUsers() {
        return repository.getAllUsers();
    }
}
