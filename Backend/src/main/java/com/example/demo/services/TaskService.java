package com.example.demo.services;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Task;
import com.example.demo.repositories.TaskRepo;

import java.util.List;
import java.util.Optional;

/**
 * Lógica detras del modelo Task, para los servicios de la aplicación con respecto al mismo.
 * Corresponde al CRUD del modelo, por lo que tendrá creación, lectura, actualización y eliminación.
 * @author Grupo 7 - TBD/BDA sección A-1 semestre 2-2023
 * @version 3.0
 */
@Service
public class TaskService {

    @Autowired
    TaskRepo repo;

    /**
     * Creación de una tarea
     * Corresponde al Create del CRUD
     * @param task entidad a almacenar en la base de datos
     * @return entidad almacenada
     */
    public Task create(Task task) {
        return repo.save(task);
    }

    /**
     * Obtener todas las tareas
     * @return todas las entidades de la tabla
     */
    public List<Task> getAll() {
        return repo.findAll();
    }

    /**
     * Obtener tarea por id
     * Corresponde al Read del CRUD
     * @param id id de la entidad
     * @return entidad con la id respectiva (o null en caso de no encontrarse)
     */
    public Optional<Task> getById(ObjectId id) {
        return repo.findById(id);
    }

    /**
     * Eliminar tarea por id
     * Corresponde al Delete del CRUD
     * @param id id de la entidad
     */
    public void deleteTask(ObjectId id) {
        repo.deleteById(id);
    }

    
    // -------------------------------------------------- Extra --------------------------------------------------

    /**
     * Buscar tareas activas asociadas a una emergencia
     * @param id_emergency id de la emergencia
     */
    public List<Task> getActiveTasksFromEmergency(int id_emergency) {
        return repo.findActiveTaskFromEmergency(id_emergency);
    }
}
