package com.service.todolist.dao.repository;

import com.service.todolist.dao.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepServiceTack extends JpaRepository<Task, Long> {
}
