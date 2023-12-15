package com.example.demo.repositories;

import com.example.demo.models.Emergency;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergencyRepo extends MongoRepository<Emergency, Integer> {
    
}
