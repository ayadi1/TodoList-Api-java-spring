package com.todolist.todolist.services;

import com.todolist.todolist.entity.Todo;
import com.todolist.todolist.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImp implements TodoService{
    @Autowired
    private TodoRepo todoRepo;


    @Override
    public Optional<Todo> getOneTodoById(long id) {
        return todoRepo.findById(id);
    }

    @Override
    public Todo addTodo(Todo todo) {
        return todoRepo.save(todo);
    }

    @Override
    public void deleteTodo(long id) {
        todoRepo.deleteById(id);
    }

    @Override
    public List<Todo> getAllTodos() {
        return todoRepo.findAll();
    }
}
