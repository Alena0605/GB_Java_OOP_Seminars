package Seminar6.HW6_7;

import Seminar6.HW6_7.Controllers.UserController;
import Seminar6.HW6_7.Exceptions.Validate;
import Seminar6.HW6_7.Logging.LogIntoCSV;
import Seminar6.HW6_7.Logging.Logger;
import Seminar6.HW6_7.Models.FileOperations;
import Seminar6.HW6_7.Models.FileOperationsImpl;
import Seminar6.HW6_7.Models.Repository;
import Seminar6.HW6_7.Models.RepositoryFile;
import Seminar6.HW6_7.Views.ViewNote;

public class Main {
    public static void main(String[] args) {
        FileOperations file = new FileOperationsImpl("Notes.csv");
        Repository repository = new RepositoryFile(file);
        Validate validate = new Validate();
        UserController userController = new UserController(repository);
        Logger logger = new LogIntoCSV();
        ViewNote viewNote = new ViewNote(userController, validate, logger);
        viewNote.run();
    }
}
