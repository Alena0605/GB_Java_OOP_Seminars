package Seminar6.HW6_7.Models;

public class Note {
    private String id = "";
    private String title;
    private String text;
    private String date;

    public Note(String date, String title, String text) {
        this.date = date;
        this.title = title;
        this.text = text;
    }

    public Note(String date, String id, String title, String text) {
        this(date, title, text);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Date: %s, ID: %s, Title: %s, Text: %s", date, id, title, text);
    }
}
