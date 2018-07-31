package com.thoughtworks.training.yangliuming.todoservice.service;

import com.thoughtworks.training.yangliuming.todoservice.Repository.TodoList;
import com.thoughtworks.training.yangliuming.todoservice.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TodoList todoList;

    public List<Task> find() {
        return todoList.list();
    }
}

