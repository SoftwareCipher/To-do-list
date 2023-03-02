package com.service.todolist.service;

import com.service.todolist.dao.entities.Task;
import com.service.todolist.dao.repository.RepServiceTack;
import com.service.todolist.service.Impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service implements ServiceImpl {

    RepServiceTack repServiceTack;

    @Autowired
    public Service(RepServiceTack repServiceTack) {
        this.repServiceTack = repServiceTack;
    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public boolean newTask(Task t) {
        return true;
    }

    @Override
    public void updateTask(Long id, Task t) {

    }

    @Override
    public void deleteTask(Long id) {

    }

    @Override
    public List<Task> filterTask(boolean state) {
        return null;
    }

    @Override
    public void completedTask(Long id, boolean state) {

    }

    @Override
    public void incompleteTask(Long id, boolean state) {

    }
}
