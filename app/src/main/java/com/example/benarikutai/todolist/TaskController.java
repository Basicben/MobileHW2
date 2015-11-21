package com.example.benarikutai.todolist;

import java.util.List;

/**
 * Created by Ben Ari Kutai on 18/11/2015.
 */
public class TaskController implements ITaskController {


    private IDataAccess dao;

    public TaskController() {
        this.dao = new MockDAO();
    }

    @Override
    public List<TaskItem> getTasks() {
        return dao.GetTasks();
    }


}
