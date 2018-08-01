package com.thoughtworks.training.yangliuming.todoservice.controller;

import com.thoughtworks.training.yangliuming.todoservice.model.Task;
import com.thoughtworks.training.yangliuming.todoservice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoAPI {
    private TaskService taskService;

    @Autowired
    public TodoAPI(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(path = "/todos")
    public List<Task> list() {
        return taskService.getList();
    }

    @PostMapping(path = "/todos")
    public void create(@RequestBody Task task) {
        taskService.create(task);
    }

}
