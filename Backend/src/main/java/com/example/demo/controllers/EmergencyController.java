package com.example.demo.controllers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Emergency;
import com.example.demo.services.EmergencyService;

import java.util.List;

@RestController
@RequestMapping("/api/emergencies")
public class EmergencyController {

    @Autowired
    EmergencyService service;

    @PostMapping
    public ResponseEntity<Emergency> create(@RequestBody Emergency emergency) {
        Emergency savedEmergency = service.create(emergency);
        return new ResponseEntity<>(savedEmergency, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Emergency>> getAll() {
        List<Emergency> emergencies = service.getAll();
        return new ResponseEntity<>(emergencies, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Emergency> getById(@PathVariable ObjectId id) {
        Emergency emergency = service.getById(id)
                .orElseThrow(() -> new RuntimeException("Emergency not found"));
        return new ResponseEntity<>(emergency, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ObjectId id) {
        service.deleteEmergency(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
