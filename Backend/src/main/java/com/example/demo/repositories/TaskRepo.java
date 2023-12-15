package com.example.demo.repositories;

import com.example.demo.models.Task;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepo extends MongoRepository<Task, ObjectId> {

    @Aggregation(pipeline = {
        "{ $match: { 'id_emergency': ?0, 'active': true } }",
        "{ $lookup: { from: 'emergency', localField: 'id_emergency', foreignField: '_id', as: 'tasks' } }"
    })
    List<Task> findActiveTaskFromEmergency(Integer id_emergency);

}


