package com.todo.app.services;

import com.todo.app.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    public List<Todo> todos = new ArrayList<>();

    public List<Todo> getAllTodos(){
        return todos;
    }

    public Todo getTodoById(String id){
        Todo currentTodo = todos.stream().filter(t -> id.equals(t.getId())).findFirst().orElse(null);
        return currentTodo;
    }

    public void createNewTodo(Todo todo) {
        todos.add(todo);
    }

    public void updateTodo(String id, Todo todo){
        for(int i = 0; i < todos.size(); i++){
            Todo currentTodo = todos.get(i);
            System.out.println(currentTodo);
            if(currentTodo.getId().equals(id)){
                todos.set(i, todo);
            }
        }
    }

    public void completeTask(String id, Todo todo, boolean done){
        for(int i = 0; i < todos.size(); i++){
            Todo currentTodo = todos.get(i);
            System.out.println(currentTodo);
            if(currentTodo.getId().equals(id)){
                currentTodo.setDone(true);
            }
        }
    }
}
