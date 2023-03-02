/**
 * Autor: Alfredo Leonelli Mendoza
 * Fecha: 20-02-2023
 */
package com.alfredo.apipokemon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alfredo.apipokemon.model.EficaciaEntreTipo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEficaciaEntreTipoRepo extends JpaRepository<EficaciaEntreTipo, Integer> {
    //Método para buscar los doble daño (2X) existentes con el ID del Tipo
    @Query(value = "Select * from eficacia_entre_tipos et where eficacia = 1 and tipo = :idTipo", nativeQuery = true)
    List<EficaciaEntreTipo> findDobleDanoByTipoID(@Param("idTipo")Integer idTipo);

    //Método para buscar los mitad daño (0.5X) existentes con el ID del Tipo
    @Query(value = "Select * from eficacia_entre_tipos et where eficacia = 2 and tipo = :idTipo", nativeQuery = true)
    List<EficaciaEntreTipo> findMitadDanoByTipoID(@Param("idTipo")Integer idTipo);

    //Método para buscar los no daño (0X) existentes con el ID del Tipo
    @Query(value = "Select * from eficacia_entre_tipos et where eficacia = 3 and tipo = :idTipo", nativeQuery = true)
    List<EficaciaEntreTipo> findNoDanoByTipoID(@Param("idTipo")Integer idTipo);
}
