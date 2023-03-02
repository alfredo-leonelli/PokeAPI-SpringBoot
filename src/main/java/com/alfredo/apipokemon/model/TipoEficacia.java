/**
 * Autor: Alfredo Leonelli Mendoza
 * Fecha: 20-02-2023
 */
package com.alfredo.apipokemon.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_eficacia")
public class TipoEficacia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_eficacia", nullable = false)
    private Integer id;

    @Column(name = "eficacia", nullable = false)
    private String eficacia;

    public Integer getId() {
        return id;
    }

    public String getEficacia() {
        return eficacia;
    }
}