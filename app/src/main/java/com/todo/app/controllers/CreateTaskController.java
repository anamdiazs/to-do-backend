package com.todo.app.controllers;

import com.todo.app.model.CreateTask;
import com.todo.app.services.CreateTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CreateTaskController {
   private final CreateTaskService createTaskService;

   @Autowired
   public CreateTaskController(CreateTaskService createTaskService) {
      this.createTaskService = createTaskService;
   }
   @GetMapping("/todos")
   public List<CreateTask> getAllTasks(){
      return createTaskService.getAllTasks();
   }

   @PostMapping("/todos")
   public void createNewTask(@RequestBody CreateTask createTask){
      createTaskService.createNewTask(createTask);
   }
}
