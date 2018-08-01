package com.thoughtworks.training.yangliuming.todoservice.controller;

import com.thoughtworks.training.yangliuming.todoservice.model.Task;
import com.thoughtworks.training.yangliuming.todoservice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoAPI {
    public class TodoController {

        private TaskService taskService;

        @Autowired
        public TodoController() {
            this.taskService = taskService;
        }

        @GetMapping(path = "/todos")
        public List<Task> list() {
            return taskService.getList();
        }

    }
}
