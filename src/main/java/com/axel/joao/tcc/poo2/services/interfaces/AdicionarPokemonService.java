package com.axel.joao.tcc.poo2.services.interfaces;

/*
 * Classe responsavel pela separacao de responsabilidade no servico de adicao do pokemon a pokedex do usuario
 * */

import com.axel.joao.tcc.poo2.domain.Pokemon;

public interface AdicionarPokemonService {
    void adicionar(Integer userId, Pokemon pokemon);
}
