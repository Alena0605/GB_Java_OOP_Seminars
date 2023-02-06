package Seminar3;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private int age;
    private Personal subordinates = new Personal();

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void addSubordinates(Personal personal) {
        subordinates = personal;
    }

    public void addOneSubordinate(User user) {
        subordinates.addUser(user);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(String.format("Name: %s, Surname: %s, Age: %d",
                                                                firstName, lastName, age));
        for (User user : subordinates) {
            result.append(String.format("\nBoss: %s %s, Subordinate: %s", firstName, lastName, user.toString()));
        }
        return result.toString();
    }

    @Override
    public int compareTo(User o) {
        int name = this.getFirstName().compareTo(o.getFirstName());
        if (name != 0) {
            return name;
        }

        int surname = this.getLastName().compareTo(o.getLastName());
        if (surname != 0) {
            return surname;
        }

        return Integer.compare(this.age, o.age);
    }
}
