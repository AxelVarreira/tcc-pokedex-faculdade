package com.axel.joao.tcc.poo2.repository;

/*
* Se comunica com a API externa atraves do FeignClient
* */

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axel.joao.tcc.poo2.domain.Pokemon;
import com.axel.joao.tcc.poo2.domain.SimplePokemon;

@FeignClient(value = "pokedex", url = "https://pokeapi.co/api/v2/" )
public interface ExternalPokemonRepository {

    @RequestMapping(method = RequestMethod.GET, value = "pokemon/{nomePokemon}")
    Pokemon pegarPokemonPorNome(@PathVariable(name = "nomePokemon") String nomePokemon);

    @RequestMapping(method = RequestMethod.GET, value = "pokemon")
    List<SimplePokemon> pegarTodosPokemons(@RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "limit") Integer limit);
}
