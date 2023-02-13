package Seminar6.HW6_7.Models;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private final NoteMapper mapper = new NoteMapper();
    private final FileOperations fileOperations;

    public RepositoryFile(FileOperations fileOperations) {
        this.fileOperations = fileOperations;
    }

    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperations.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public String createNote(Note note) {
        List<Note> notes = getAllNotes();
        int max = 0;

        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }

        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);

        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            lines.add(mapper.map(item));
        }

        fileOperations.saveAllLines(lines);
        return id;
    }

    @Override
    public void updateNote(Note note, Fields field, String param) {
        if (field == Fields.TITLE) {
            note.setTitle(param);
        } else if (field == Fields.TEXT) {
            note.setText(param);
        }
        saveNotes(note);
    }

    @Override
    public void deleteNote(Note note) {
        List<Note> notes = getAllNotes();
        List<String> lines = new ArrayList<>();
        int id = 1;
        for (Note item : notes) {
            if (!note.getId().equals(item.getId())) {
                item.setId(String.format("%d", id++));
                lines.add(mapper.map(item));
            }
        }
        fileOperations.saveAllLines(lines);
    }

    public void saveNotes(Note note) {
        List<Note> notes = getAllNotes();
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            if (note.getId().equals(item.getId())) {
                lines.add(mapper.map(note));
            } else {
                lines.add(mapper.map(item));
            }
        }
        fileOperations.saveAllLines(lines);
    }
}
