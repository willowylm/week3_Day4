package com.thoughtworks.training.yangliuming.todoservice.Repository;

import com.thoughtworks.training.yangliuming.todoservice.model.Task;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class TodoList {
    public List<Task> list(){
        return Arrays.asList(
                new Task("1","task1"),
                new Task("2","task2"),
                new Task("3","task3"),
                new Task("4","task4")

        );
    }
}
