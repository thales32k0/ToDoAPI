package com.thales.todoapi.controller;

import com.thales.todoapi.model.Task;
import com.thales.todoapi.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final   TaskRepository repository;

    public TaskController(TaskRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Task> list(){
        return repository.findAll();
    }
    @PostMapping
    public Task create(@RequestBody Task task){
        return repository.save(task);
    }
    @PutMapping("/{id}")
    public Task update(@PathVariable Long id, @RequestBody Task task) {
        Task existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));

        existing.setTitle(task.getTitle());
        existing.setDescription(task.getDescription());
        existing.setCompleted(task.isCompleted());

        return repository.save(existing);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}