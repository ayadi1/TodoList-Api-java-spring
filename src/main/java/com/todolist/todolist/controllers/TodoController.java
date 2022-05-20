package com.todolist.todolist.controllers;


import com.todolist.todolist.entity.Todo;
import com.todolist.todolist.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/todo")
@CrossOrigin("*")
public class TodoController {
    @Autowired
    private TodoService todoService;


    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public Todo getOneTodoById(@PathVariable long id){
        return todoService.getOneTodoById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"todo not fund"));
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable long id){
        todoService.deleteTodo(id);
    }
}
