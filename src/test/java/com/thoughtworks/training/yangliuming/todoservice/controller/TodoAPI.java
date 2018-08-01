package com.thoughtworks.training.yangliuming.todoservice.controller;

import com.thoughtworks.training.yangliuming.todoservice.Repository.TodoList;
import com.thoughtworks.training.yangliuming.todoservice.model.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class TodoAPI{

@Autowired
private MockMvc mockMvc;


@MockBean
private TodoList todolist;



@Test
public void shouldReturnItem()throws Exception{
      List<Task> list = new ArrayList<>();
    list.add(new Task("1", "todo1"));
    list.add(new Task("2", "todo2"));
    list.add(new Task("3", "todo3"));



    when(todolist.list())
        .thenReturn(list);
        MvcResult result=mockMvc
        .perform(get("/todo"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.length()").value(3))
        .andExpect(jsonPath("$[0].id").value("1"))
        .andReturn();
        assertThat(result.getResponse().getStatus(),is(200));
        System.out.println(result.getResponse().getContentAsString());

        }


        }
