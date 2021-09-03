package com.axel.joao.tcc.poo2.repository;


import org.springframework.data.repository.CrudRepository;

import com.axel.joao.tcc.poo2.domain.Pokedex;

public interface PokedexRepository extends CrudRepository<Pokedex, Integer> {

    @Override
    <S extends Pokedex> S save(S s);

    Pokedex findPokedexByUserId(Integer id);

    void deletePokemonByPokemonListByPokemonByIdPokemon(Integer id);
}
