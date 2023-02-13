package Seminar6.HW6_7.Controllers;

import Seminar6.HW6_7.Models.Fields;
import Seminar6.HW6_7.Models.Note;
import Seminar6.HW6_7.Models.Repository;

import java.util.List;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) {
        repository.createNote(note);
    }

    public void changeNote(Note note, Fields field, String param) {
        repository.updateNote(note, field, param);
    }

    public void removeNote(Note note) {
        repository.deleteNote(note);
    }

    public Note readNote(String noteID) throws Exception {
        List<Note> notes = repository.getAllNotes();
        for (Note note : notes) {
            if (note.getId().equals(noteID)) {
                return note;
            }
        }

        throw new Exception("ERROR! User not found!");
    }

    public List<Note> readAllNotes() {
        return repository.getAllNotes();
    }
}
