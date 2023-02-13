package Seminar6.HW6_7.Models;

public class NoteMapper {
    public String map(Note note) {
        return String.format("%s;%s;%s;%s", note.getDate(), note.getId(), note.getTitle(), note.getText());
    }

    public Note map(String line) {
        String[] lines = line.split(";");
        return new Note(lines[0], lines[1], lines[2], lines[3]);
    }
}
