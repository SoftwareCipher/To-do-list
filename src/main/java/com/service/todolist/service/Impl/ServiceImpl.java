package com.service.todolist.service.Impl;

import com.service.todolist.dao.entities.Task;
import java.util.List;

public interface ServiceImpl {
    List<Task> getAllTasks();
    boolean newTask(Task t);
    void updateTask(Task t);
    void deleteTask(Long id);
    List<Task> filterTask(boolean state);
    void completedTask(Long id, boolean state);
    void incompleteTask(Long id, boolean state);
    boolean isTaskExist(Long id);
}
