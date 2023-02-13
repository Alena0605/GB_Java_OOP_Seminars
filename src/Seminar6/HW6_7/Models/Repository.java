package Seminar6.HW6_7.Models;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();
    String createNote(Note note);
    void updateNote(Note note, Fields field, String param);
    void deleteNote(Note note);

}
