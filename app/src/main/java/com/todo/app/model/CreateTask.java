package com.todo.app.model;

import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.lang.NonNull;

import java.time.LocalDate;

public class CreateTask {
    private int id;
    
    private String text;
    private LocalDate dueDate;
    private boolean done;

    @NonNull
    private String priority;
    private LocalDate creationDate;

    public CreateTask(int id, String text, LocalDate dueDate, boolean done, String priority, LocalDate creationDate) {
        this.id = id;
        this.text = text;
        this.dueDate = dueDate;
        this.done = done;
        this.priority = priority;
        this.creationDate = creationDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isDone() {
        return done;
    }

    public String getPriority() {
        return priority;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
}
