package com.thoughtworks.training.yangliuming.todoservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import groovy.transform.builder.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "todoList")
public class Task {
    @Id
    @GeneratedValue
    private Integer id;
    private String content;

    @JsonProperty
    boolean complete() {
        return false;
    }

}
