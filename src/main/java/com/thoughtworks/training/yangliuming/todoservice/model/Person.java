package com.thoughtworks.training.yangliuming.todoservice.model;

//@Data
//@AllArgsConstructor
//@
public class Person {

    private final String name;
    private final String from;

    public Person(String name, String from) {
        this.name = name;
        this.from = from;
    }

    public String getName() {
        return name;
    }

    public String getFrom() {
        return from;
    }
}
