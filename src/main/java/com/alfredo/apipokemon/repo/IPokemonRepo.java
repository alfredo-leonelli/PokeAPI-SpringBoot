/**
 * Autor: Alfredo Leonelli Mendoza
 * Fecha: 28-02-2023
 */
package com.alfredo.apipokemon.repo;

import com.alfredo.apipokemon.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPokemonRepo extends JpaRepository<Pokemon, Integer> {
}
