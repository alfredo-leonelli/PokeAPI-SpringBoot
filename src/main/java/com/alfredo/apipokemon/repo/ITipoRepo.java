/**
 * Autor: Alfredo Leonelli Mendoza
 * Fecha: 13-02-2023
 */
package com.alfredo.apipokemon.repo;

import com.alfredo.apipokemon.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoRepo extends JpaRepository<Tipo, Integer> {
    //Método para buscar un tipo por el nombre
    Tipo findByNombretipo(String nombretipo);
}
