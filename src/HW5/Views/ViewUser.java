package HW5.Views;

import HW5.Controllers.UserController;
import HW5.Models.Fields;
import HW5.Models.User;
import HW5.Exceptions.*;

import java.util.Scanner;

public class ViewUser {
    private final UserController userController;
    private final Validate validate;

    public ViewUser(UserController userController, Validate validate) {
        this.userController = userController;
        this.validate = validate;
    }

    public void run() {
        Commands com;
        helpCommand();

        while (true) {
            try {
                String command = prompt("Enter the command: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case HELP -> helpCommand();
                    case CREATE -> create();
                    case READ -> System.out.println(read());
                    case LIST -> list();
                    case UPDATE -> update();
                    case DELETE -> delete();
                }
            } catch (Exception ex) {
                System.out.println("ERROR! " + ex);
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private void helpCommand() {
        System.out.println("List of commands:\n");
        for (Commands command : Commands.values()) {
            System.out.println(command);
        }
        System.out.println("=====================");
    }

    private void create() throws Exception {
        String firstName = inputName("Name");
        if (firstName == null) {
            return;
        }
        String lastName = inputName("Surname");
        if (lastName == null) {
            return;
        }
        String phone = inputTelephone();
        if (phone == null) {
            return;
        }

        String sep = prompt("If you want to change the separator, enter ',' or ';' or '/': ");
        if (sep.equals(",") || sep.equals(";") || sep.equals("/")) {
            userController.saveUser(new User(firstName, lastName, phone), sep);
        } else {
            userController.saveUser(new User(firstName, lastName, phone), ";");
        }
    }

    private void list() {
        for (User user : userController.readAllUsers()) {
            System.out.println(user);
        }
    }

    private User read() throws Exception {
        String id = prompt("Enter the ID of user: ");
        return userController.readUser(id);
    }

    private void update() throws Exception {
        User user = read();
        System.out.println(user);
        System.out.println("==============================================");

        String field = prompt("If you don't want to change this user, press enter.\n" +
                "If you choose correct user, enter field for changing (NAME, SURNAME, PHONE): ");
        String param = null;

        if (field.equals("")) {
            return;
        } else if (Fields.valueOf(field.toUpperCase()) == Fields.PHONE) {
            param = inputTelephone();
        } else if (Fields.valueOf(field.toUpperCase()) == Fields.NAME) {
            param = inputName("Enter new name: ");
        } else if (Fields.valueOf(field.toUpperCase()) == Fields.SURNAME) {
            param = inputName("Enter new surname: ");
        }

        if (param == null) {
            return;
        }
        userController.changeUser(user, Fields.valueOf(field.toUpperCase()), param);
    }

    private void delete() throws Exception {
        User user = read();
        System.out.println(user);
        System.out.println("==============================================");

        String result = prompt("To delete, press enter: ");
        if (result.equals("")) {
            userController.removeUser(user);
        }
    }

    private String inputTelephone() throws Exception {
        while (true) {
            try {
                String telephone = prompt("Phone number (to refuse, press enter): ");
                if (telephone.equals("")) {
                    System.out.println("You interrupted the input of number.");
                    return null;
                }
                validate.checkPhone(telephone);
                return telephone;
            } catch (PhoneException ex) {
                System.out.println("ERROR! " + ex);
            }
        }
    }

    private String inputName(String str) throws Exception {
        while (true) {
            try {
                String name = prompt(str + " (to refuse, press enter): ");
                if (name.equals("")) {
                    System.out.println("You interrupted the input.");
                    return null;
                }
                validate.checkName(name);
                return name;
            } catch (NameException ex) {
                System.out.println("ERROR! " + ex);
            }
        }
    }
}
