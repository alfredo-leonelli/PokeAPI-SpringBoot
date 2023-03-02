/**
 * Autor: Alfredo Leonelli Mendoza
 * Fecha: 13-02-2023
 */
package com.alfredo.apipokemon.rest;

import com.alfredo.apipokemon.model.Tipo;
import com.alfredo.apipokemon.repo.IEficaciaEntreTipoRepo;
import com.alfredo.apipokemon.repo.ITipoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class RestTipoController {
    @Autowired
    private ITipoRepo tipoRepo;

    @Autowired
    private IEficaciaEntreTipoRepo eficaciaEntreTipoRepo;

    //Método que lista todos los tipos encontrados en la base de datos
    @GetMapping("/tipos")
    public List<Tipo> listar(){
        return tipoRepo.findAll();
    }

    //Método que lista un tipo buscado por su nombre
    /**@GetMapping("/tipos/{nombretipo}")
    public Tipo getTipoByNombre(@PathVariable("nombretipo") String nombretipo){
        return tipoRepo.findByNombretipo(nombretipo);
    }*/

    //Método que lista el tipo buscado por ID y la información respecto a la eficacia de sus ataques
    @GetMapping("/tipos/{id}")
    public Map getInfoTipo(@PathVariable("id") Integer id){
        Map infoTipo = new HashMap();
        infoTipo.put("tipo", tipoRepo.findById(id));
        infoTipo.put("doble_dano_a", eficaciaEntreTipoRepo.findDobleDanoByTipoID(id));
        infoTipo.put("mitad_dano_a", eficaciaEntreTipoRepo.findMitadDanoByTipoID(id));
        infoTipo.put("no_dano_a", eficaciaEntreTipoRepo.findNoDanoByTipoID(id));
        return infoTipo;
    }
}