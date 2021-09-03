package com.axel.joao.tcc.poo2.repository;

/*
* Faz a comunicacao com a tabela da Pokedex no banco de dados e utiliza o Spring boot como mediador
* */

import org.springframework.data.repository.CrudRepository;

import com.axel.joao.tcc.poo2.domain.Pokedex;

public interface PokedexRepository extends CrudRepository<Pokedex, Integer> {

    @Override
    <S extends Pokedex> S save(S s);

    Pokedex findPokedexByUser(Integer id);
}
