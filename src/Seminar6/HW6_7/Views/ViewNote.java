package Seminar6.HW6_7.Views;

import Seminar6.HW6_7.Controllers.NoteController;
import Seminar6.HW6_7.Exceptions.*;
import Seminar6.HW6_7.Logging.Logger;
import Seminar6.HW6_7.Models.Fields;
import Seminar6.HW6_7.Models.Note;

import java.util.Date;
import java.util.Scanner;

public class ViewNote {
    private final NoteController noteController;
    private final Validate validate;
    private final Logger logger;

    public ViewNote(NoteController noteController, Validate validate, Logger logger) {
        this.noteController = noteController;
        this.validate = validate;
        this.logger = logger;
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
                    case READ -> read();
                    case LIST -> list();
                    case UPDATE -> update();
                    case DELETE -> delete();
                }
            } catch (Exception ex) {
                System.out.println("ERROR! " + ex);
            }
        }
    }

    private void helpCommand() {
        System.out.println("====================================");
        System.out.println("List of commands for working with notes:\n");
        for (Commands command : Commands.values()) {
            System.out.println(command);
        }
        System.out.println("====================================");
    }

    private void create() throws Exception {
        String title = checkTitle("Add the title");

        String text = checkText("Add some description");
        if (text == null) {
            return;
        }

        String currentDate = String.format("%s", new Date());

        noteController.saveNote(new Note(currentDate, title, text));
        logger.saveCSV("Create new note");
    }

    private void read() throws Exception {
        String id = prompt("Enter the ID of note: ");
        logger.saveCSV(String.format("Reading note '%s - %s'",
                noteController.readNote(id).getTitle(), noteController.readNote(id).getDate()));
        System.out.println(noteController.readNote(id));
    }

    private void list() {
        for (Note note : noteController.readAllNotes()) {
            System.out.println(note);
        }
        logger.saveCSV("Reading all notes");
    }

    private void update() throws Exception {
        Note note = checkNote();
        System.out.println(note);
        System.out.println("======================================================================================");

        String field = prompt("If you don't want to change this note, press enter.\n" +
                "If you choose correct note, enter field for changing (TITLE, TEXT): ");
        String param = null;

        if (field.equals("")) {
            return;
        } else if (Fields.valueOf(field.toUpperCase()) == Fields.TITLE) {
            param = checkTitle("Enter new title");
        } else if (Fields.valueOf(field.toUpperCase()) == Fields.TEXT) {
            param = checkText("Add new description");
        }

        if (param == null) {
            return;
        }

        String id = note.getId();

        String currentDate = String.format("%s", new Date());
        noteController.readNote(id).setDate(currentDate);

        noteController.changeNote(note, Fields.valueOf(field.toUpperCase()), param);
        logger.saveCSV(String.format("Change note '%s - %s'",
                noteController.readNote(id).getTitle(), noteController.readNote(id).getDate()));
    }

    private void delete() throws Exception {
        Note note = checkNote();
        System.out.println(note);
        System.out.println("======================================================================================");

        String result = prompt("Press enter to delete (enter any button to refuse): ");
        if (result.equals("")) {
            noteController.removeNote(note);

            String id = note.getId();
            logger.saveCSV(String.format("Delete note '%s - %s'",
                    noteController.readNote(id).getTitle(), noteController.readNote(id).getDate()));
        }
    }

    private String checkTitle(String str) {
        String title = prompt(str + " (press enter to pass): ");
        if (title.isEmpty()) {
            title = "NO TITLE";
        }
        return title;
    }

    private String checkText(String str) throws Exception {
        while (true) {
            try {
                String text = prompt(str + " (enter 'q' to refuse): ");
                if (text.equals("q".toLowerCase())) {
                    System.out.println("You interrupted the input!");
                    return null;
                }
                validate.checkInput(text);
                return text;
            } catch (EmptyInput e) {
                System.out.println("ERROR! " + e);
            }
        }
    }

    private Note checkNote() throws Exception {
        String id = prompt("Enter the ID of note: ");
        return noteController.readNote(id);
    }

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
