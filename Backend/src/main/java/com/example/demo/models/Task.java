package com.example.demo.models;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

/**
 * Este modelo corresponde al de una tarea
 * @author Grupo 7 - TBD/BDA sección A-1 semestre 2-2023
 * @version 3.0
 */
@Document(collection = "tasks")
public class Task {
    // ----------------------------------------- Atributos --------------------------------------------------
    /**
     * Columna con la id de la tarea, la cual se genera automáticamente de forma creciente.
     * Es única para cada tarea
     * No puede ser nula
     */
    @Id
    private ObjectId _id;
    /**
     * Columna con el nombre de la tarea.
     * No puede ser nula
     */
    private String name;
    /**
     * Columna con la descripción detallada de la tarea.
     * No puede ser nula
     */
    private String description;
    /**
     * Columna que dice si la tarea sigue activa, 1 para activa 0 para inactiva.
     * No puede ser nula
     */
    private Boolean active;
    /**
     * Columna con la id de la emergencia asociada a la tarea.
     * No puede ser nula
     */
    private int id_emergency;



    // ----------------------------------------- Métodos -----------------------------------------------------

    /**
     * Método que permite obtener la id de una tarea
     * @return id de la tarea (un valor de tipo Long)
     */
    public ObjectId getIdTask() {
        return this._id;
    }
    /**
     * Método que permite obtener el nombre de una tarea
     * @return nombre de la tarea (un valor de tipo String)
     */
    public String getName() {
        return name;
    }
    /**
     * Método que permite actualizar el nombre de una tarea
     * @param name nuevo nombre para la tarea (de tipo String)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método que permite obtener la descripción de una tarea
     * @return descripción de la tarea (un valor de tipo String)
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método que permite actualizar la descripción de una tarea
     * @param description nueva descripción para la tarea (de tipo String)
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Método que permite obtener si una tarea esta activa o no.
     * @return actividad de la tarea (un valor de tipo boolean)
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Método que permite actualizar la actividad de una tarea
     * @param active nuevo valor (de tipo boolean)
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Método que permite obtener la id de la emergencia asociada a una tarea
     * @return id de la emergencia (un valor de tipo Long)
     */
    public int getIdEmergency() {
        return id_emergency;
    }

    /**
     * Método que permite actualizar la id de la emergencia asociada a una tarea
     * @param id_emergency nueva id de la emergencia para la tarea (de tipo Long)
     */
    public void setIdEmergency(int id_emergency) {
        this.id_emergency = id_emergency;
    }
}
