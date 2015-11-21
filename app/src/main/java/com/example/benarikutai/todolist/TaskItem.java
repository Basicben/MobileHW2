package com.example.benarikutai.todolist;

/**
 * Created by Ben Ari Kutai on 18/11/2015.
 */
public class TaskItem {

    private String description;

    public TaskItem(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
