package com.thoughtworks.training.yangliuming.todoservice.Repository;

import com.thoughtworks.training.yangliuming.todoservice.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface TodoList extends JpaRepository<Task,Integer> {

}
