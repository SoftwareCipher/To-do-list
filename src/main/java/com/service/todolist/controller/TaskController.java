package com.service.todolist.controller;

import com.service.todolist.dao.entities.Task;
import com.service.todolist.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    Service service;

    @Autowired
    public TaskController(Service service) {
        this.service = service;
    }

    @GetMapping("/all")
    List<Task> getAllTasks(){
        return getAllTasks();
    }
    @PostMapping("/newTask")
    boolean newTask(@RequestBody Task t){
        return service.newTask(t);
    }

    @PostMapping("/update/{id}")
    void updateTask(@PathVariable Long id, @RequestBody Task t){
        service.updateTask(id, t);
    }

    @PostMapping("/delete/{id}")
    void deleteTask(@PathVariable Long id){
        service.deleteTask(id);
    }

    @PostMapping("/filter/{state}")
    List<Task> filterTask(@PathVariable boolean state){
        return service.filterTask(state);
    }

    void completedTask(@PathVariable Long id, @PathVariable boolean state){
        service.completedTask(id, state);
    }

    void incompleteTask(@PathVariable Long id, @PathVariable boolean state){
        service.incompleteTask(id, state);
    }
}
