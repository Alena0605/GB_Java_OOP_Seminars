package HW5;

import HW5.Controllers.UserController;
import HW5.Exceptions.Validate;
import HW5.Models.FileOperation;
import HW5.Models.FileOperationImpl;
import HW5.Models.Repository;
import HW5.Models.RepositoryFile;
import HW5.Views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("Users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}
