package com.axel.joao.tcc.poo2.services.interfaces;

/*
 * Classe responsavel pela separacao de responsabilidade no servico de consulta do pokemon
 * */

import com.axel.joao.tcc.poo2.domain.Pokemon;

public interface BuscarPokemonService {
    Pokemon buscar(String nome);
}
