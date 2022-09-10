package com.todo.app.controllers;

import com.todo.app.model.Todo;
import com.todo.app.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class TodoController {
   private final TodoService todoService;

   @Autowired
   public TodoController(TodoService todoService) {
      this.todoService = todoService;
   }
   @GetMapping("/todos")
   @ResponseStatus(HttpStatus.ACCEPTED)
   public List<Todo> getAllTodos(){
      return todoService.getAllTodos();
   }

   @GetMapping("/todos/{id}")
   @ResponseStatus(HttpStatus.ACCEPTED)
   public Todo getTodoById(@PathVariable String id) {
      return todoService.getTodoById(id);
   }

   @PostMapping("/todos")
   @ResponseStatus(HttpStatus.CREATED)
   public void createNewTodo(@RequestBody Todo todo){
      todoService.createNewTodo(todo);
      System.out.println(todo.getId());
   }

   @PutMapping("/todos/{id}")
   @ResponseStatus(HttpStatus.ACCEPTED)
   public void updateTodo(@RequestBody Todo todo, @PathVariable String id ){
      todoService.updateTodo(id, todo);
   }
   @PutMapping("/todos/{id}/done")
   @ResponseStatus(HttpStatus.ACCEPTED)
   public void completeTask(@RequestBody Todo todo, @PathVariable String id ){
      todoService.completeTask(id, todo);
   }





}
