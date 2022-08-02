package com.scaler.tasks.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
    private int id;
    private String title;
    private String description;
    private Date deadline;

    private boolean completed;

    private List<Note> notes;

    public Task(int id, String title, String description, Date deadline) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;

        notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public boolean isCompleted() {
        return completed;
    }
}
