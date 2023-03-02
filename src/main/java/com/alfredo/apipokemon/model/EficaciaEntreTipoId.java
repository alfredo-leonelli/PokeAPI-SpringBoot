/**
 * Autor: Alfredo Leonelli Mendoza
 * Fecha: 20-02-2023
 */
package com.alfredo.apipokemon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EficaciaEntreTipoId implements Serializable {
    private static final long serialVersionUID = -4895702143190550583L;

    @Column(name = "tipo", nullable = false)
    private Integer tipo;

    @Column(name = "tipo_afectado", nullable = false)
    private Integer tipoAfectado;

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipoAfectado() {
        return tipoAfectado;
    }

    public void setTipoAfectado(Integer tipoAfectado) {
        this.tipoAfectado = tipoAfectado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EficaciaEntreTipoId entity = (EficaciaEntreTipoId) o;
        return Objects.equals(this.tipo, entity.tipo) &&
                Objects.equals(this.tipoAfectado, entity.tipoAfectado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, tipoAfectado);
    }
}