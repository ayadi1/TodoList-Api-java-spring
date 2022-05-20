package com.todolist.todolist.services;


import com.todolist.todolist.entity.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService  {
    Optional<Todo> getOneTodoById(long id);
    Todo addTodo(Todo todo);
    void deleteTodo(long id);
    List<Todo> getAllTodos();
}
