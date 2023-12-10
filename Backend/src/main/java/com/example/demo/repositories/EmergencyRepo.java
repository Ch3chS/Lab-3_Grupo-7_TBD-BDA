package com.example.demo.repositories;

import com.example.demo.models.Emergency;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface EmergencyRepo {
    int countEmergencies();
    Emergency createEmergency(Emergency emergency);
    List<Emergency> findAll();
    Optional<Emergency> findById(ObjectId id);
    Emergency save(Emergency emergency);
    void deleteById(ObjectId id);
}
