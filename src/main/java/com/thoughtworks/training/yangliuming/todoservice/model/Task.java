package com.thoughtworks.training.yangliuming.todoservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import groovy.transform.builder.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {
    private String id;
    private String content;

    @JsonProperty
    boolean complete() {
        return false;
    }


    public String getId(){
        return id;
    }

    public String getContent(){
        return content;
    }
}
