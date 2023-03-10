/**
 * Autor: Alfredo Leonelli Mendoza
 * Fecha: 28-02-2023
 */
package com.alfredo.apipokemon.rest;

import com.alfredo.apipokemon.model.Pokemon;
import com.alfredo.apipokemon.repo.IPokemonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class RestPokemonController {
    @Autowired
    private IPokemonRepo pokemonRepo;

    //Método para guardar un pokémon en la base de datos
    @PostMapping("/pokemones")
    public Pokemon guardarPokemon(@RequestBody Pokemon pokemon){
        return pokemonRepo.save(pokemon);
    }

    //Método que lista todos los pokemones encontrados en la base de datos
    @GetMapping("/pokemones")
    public List<Pokemon> listar(){
        return pokemonRepo.findAll();
    }
}
