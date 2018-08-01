package com.thoughtworks.training.yangliuming.todoservice.controller;

import com.thoughtworks.training.yangliuming.todoservice.model.Task;
import com.thoughtworks.training.yangliuming.todoservice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
        private TaskService taskService;
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void onNotFoundException() {

    }

    public TodoController() {
        this.taskService = taskService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/todo")
        public List<Task> hello(Model model) {
//            model.addAttribute("tasks", taskService.getList());
        System.out.println("kmj---------------");
            return taskService.getList();
        }

}
