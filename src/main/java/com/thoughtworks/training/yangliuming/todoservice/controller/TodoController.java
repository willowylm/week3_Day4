package com.thoughtworks.training.yangliuming.todoservice.controller;

import com.thoughtworks.training.yangliuming.todoservice.model.Task;
import com.thoughtworks.training.yangliuming.todoservice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class TodoController {

    @Autowired
        private TaskService taskService;

    public TodoController() {
        this.taskService = taskService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/todo")
        public String hello(Model model) {
            model.addAttribute("tasks", taskService.find());
            return "hello";
        }

}
