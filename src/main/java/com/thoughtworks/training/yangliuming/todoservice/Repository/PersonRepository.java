package com.thoughtworks.training.yangliuming.todoservice.Repository;

import com.thoughtworks.training.yangliuming.todoservice.model.Person;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PersonRepository {
    public List<Person> list() {
        return Arrays.asList(
                new Person("yangliuming", "xian"),
                new Person("yangliuming2", "xian"),
                new Person("yangliuming3", "xian")

        );

    }

}

