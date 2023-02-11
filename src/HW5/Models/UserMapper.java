package HW5.Models;

public class UserMapper {
    public String map(User user, String sep) {
        return String.format("%s%s%s%s%s%s%s",
                user.getId(), sep, user.getFirstName(), sep, user.getLastName(), sep, user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.replace(",", " ").replace(";", " ")
                .replace("/", " ").split(" ", 0);
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
