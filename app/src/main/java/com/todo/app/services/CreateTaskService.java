package com.todo.app.services;

import com.todo.app.model.CreateTask;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CreateTaskService {
    public List<CreateTask> tasks = new ArrayList<>();

    public List<CreateTask> getAllTasks(){
        return  tasks;
    }
    public void createNewTask(CreateTask createTask) {
        tasks.add(createTask);
        System.out.println(createTask);
    }
}
