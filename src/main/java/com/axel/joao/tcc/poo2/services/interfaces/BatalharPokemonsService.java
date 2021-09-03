package com.axel.joao.tcc.poo2.services.interfaces;

/*
 * Classe responsavel pela separacao de responsabilidade no servico da batalha entre pokemons
 * */

import com.axel.joao.tcc.poo2.domain.Pokemon;
import com.axel.joao.tcc.poo2.response.BatalhaResponse;

public interface BatalharPokemonsService {
    BatalhaResponse batalhar(Pokemon pokemon);
}
