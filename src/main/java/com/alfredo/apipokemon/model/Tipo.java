/**
 * Autor: Alfredo Leonelli Mendoza
 * Fecha: 13-02-2023
 */
package com.alfredo.apipokemon.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.persistence.*;

@Entity
@Table(name = "tipo")
public class Tipo {
    @JsonCreator
    public Tipo(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombretipo", nullable = false)
    private String nombretipo;

    public Integer getId() {
        return id;
    }

    public String getNombretipo() {
        return nombretipo;
    }
}