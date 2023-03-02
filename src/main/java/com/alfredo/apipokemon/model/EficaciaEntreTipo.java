/**
 * Autor: Alfredo Leonelli Mendoza
 * Fecha: 20-02-2023
 */
package com.alfredo.apipokemon.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "eficacia_entre_tipos")
public class EficaciaEntreTipo {
    @EmbeddedId
    @JsonIgnore
    private EficaciaEntreTipoId id;

    @MapsId("tipo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonIgnore
    private Tipo tipo;

    @MapsId("tipoAfectado")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_afectado", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Tipo tipoAfectado;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "eficacia", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonIgnore
    private TipoEficacia eficacia;

    public EficaciaEntreTipoId getId() {
        return id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Tipo getTipoAfectado() {
        return tipoAfectado;
    }

    public TipoEficacia getEficacia() {
        return eficacia;
    }
}