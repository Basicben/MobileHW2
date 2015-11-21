package com.example.benarikutai.todolist;

import java.util.List;

/**
 * Created by Ben Ari Kutai on 18/11/2015.
 */
public interface IDataAccess {
    List<TaskItem> GetTasks();
}
