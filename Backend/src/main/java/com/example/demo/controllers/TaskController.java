package com.example.demo.controllers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Task;
import com.example.demo.services.TaskService;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    TaskService service;

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody Task task) {
        Task savedTask = service.create(task);
        return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAll() {
        List<Task> tasks = service.getAll();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getById(@PathVariable ObjectId id) {
        Task task = service.getById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ObjectId id) {
        service.deleteTask(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/activeTasksByEmergency")
    public ResponseEntity<List<Task>> getActiveTasksFromEmergency(@RequestBody Map<String, Integer> body) {
        int id_emergency = body.get("id_emergency");
        List<Task> tasks = service.getActiveTasksFromEmergency(id_emergency);
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }


    
}
