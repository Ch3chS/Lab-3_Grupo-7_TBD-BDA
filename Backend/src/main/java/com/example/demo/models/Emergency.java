package com.example.demo.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

/**
 * Este modelo corresponde al de una emergencia
 * @author Grupo 7 - TBD/BDA sección A-1 semestre 2-2023
 * @version 3.0
 */
@Document(collection = "emergencies")
public class Emergency {
    // ----------------------------------------- Atributos --------------------------------------------------
    /**
     * Columna con la id de la emergencia, la cual se genera automáticamente.
     * Es única para cada emergencia
     * No puede ser nula
     */
    @Id
    private int _id;
    /**
     * Una id alternativa, para hacer su uso como llave foranea en el modelo Task
     * Es única para cada emergencia
     * No puede ser nula
     */
    private int id_emergency;
    /**
     * Columna con la descripción detallada de la emergencia.
     * No puede ser nula
     */
    private String description;
    /**
     * Columna que dice si la emergencia sigue activa, 1 para activa 0 para inactiva.
     * No puede ser nula
     */
    private Boolean active;
    /**
     * Columna con la ubicación de la emergencia.
     * Actualización postGIS (lab 2)
     */
    private GeoJsonPoint location;



    // ----------------------------------------- Métodos -----------------------------------------------------

    /**
     * Método que permite obtener la _id de una emergencia usada en la BD
     * @return id de la emergencia (un valor de tipo int)
     */
    public int get_Id() {
        return this._id;
    }

    /**
     * Método que permite obtener la id de una emergencia
     * @return id de la emergencia (un valor de tipo int)
     */
    public int getId() {
        return this.id_emergency;
    }


    /**
     * Método que permite obtener la descripción de una emergencia
     * @return descripción de la emergencia (un valor de tipo String)
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método que permite actualizar la descripción de una emergencia
     * @param description nueva descripción para la emergencia (de tipo String)
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Método que permite obtener si una emergencia esta activa o no.
     * @return actividad de la emergencia (un valor de tipo boolean)
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Método que permite actualizar la actividad de una emergencia
     * @param active nuevo valor (de tipo boolean)
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Método que permite obtener la ubicación de una emergencia
     * @return ubicación de la emergencia (un valor de tipo Geometry)
     */
    public GeoJsonPoint getLocation() {
        return location;
    }

    /**
     * Método que permite actualizar la ubicación de una emergencia
     * @param location nueva ubicación para la emergencia (de tipo Geometry)
     */
    public void setLocation(GeoJsonPoint location) {
        this.location = location;
    }
}

