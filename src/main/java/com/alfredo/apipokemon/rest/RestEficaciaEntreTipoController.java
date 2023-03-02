/**
 * Autor: Alfredo Leonelli Mendoza
 * Fecha: 20-02-2023
 */
package com.alfredo.apipokemon.rest;

import com.alfredo.apipokemon.model.EficaciaEntreTipo;
import com.alfredo.apipokemon.repo.IEficaciaEntreTipoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class RestEficaciaEntreTipoController {

    @Autowired
    private IEficaciaEntreTipoRepo eficaciaEntreTipoRepo;

    @GetMapping("/tipos/doble_dano/{idTipo}")
    public List<EficaciaEntreTipo> listarDobleDanos(@PathVariable("idTipo") Integer idTipo){
        return eficaciaEntreTipoRepo.findDobleDanoByTipoID(idTipo);
    }

    @GetMapping("/tipos/mitad_dano/{idTipo}")
    public List<EficaciaEntreTipo> listarMitadDanos(@PathVariable("idTipo") Integer idTipo){
        return eficaciaEntreTipoRepo.findMitadDanoByTipoID(idTipo);
    }

    @GetMapping("/tipos/no_dano/{idTipo}")
    public List<EficaciaEntreTipo> listarNoDanos(@PathVariable("idTipo") Integer idTipo){
        return eficaciaEntreTipoRepo.findNoDanoByTipoID(idTipo);
    }
}