package com.thoughtworks.training.yangliuming.todoservice.controller;

import com.thoughtworks.training.yangliuming.todoservice.model.Person;
import com.thoughtworks.training.yangliuming.todoservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    @Autowired
    private HelloService helloSrevice;

    @RequestMapping(method = RequestMethod.GET,
            path = "/hello/{name}")
    public String hello(
            @PathVariable String name,
            Model model) {
        new Person("yangliuming", "xian");
        model.addAttribute("person", helloSrevice.find(name));
        return "hello";
    }
}
