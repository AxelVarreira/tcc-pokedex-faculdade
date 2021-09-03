package com.axel.joao.tcc.poo2.services.impl;

/*
* Servico onde a batalha pokemon acontece, pra isso, ele precisa somente do pokemon do usuario
* */

import java.util.Collections;
import java.util.List;

import com.axel.joao.tcc.poo2.response.BatalhaResponse;
import org.springframework.beans.factory.annotation.Autowired;

import com.axel.joao.tcc.poo2.domain.Pokemon;
import com.axel.joao.tcc.poo2.domain.SimplePokemon;
import com.axel.joao.tcc.poo2.repository.ExternalPokemonRepository;
import com.axel.joao.tcc.poo2.services.interfaces.BatalharPokemonsService;
import com.axel.joao.tcc.poo2.services.interfaces.BuscarPokemonService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@Service
public class BatalharPokemonServiceImpl implements BatalharPokemonsService {

    @Autowired
    ExternalPokemonRepository externalPokemonRepository;

    @Autowired
    BuscarPokemonService buscarPokemonService;

    @Autowired
    BatalhaResponse resultado;

    @Override
    public BatalhaResponse batalhar(Pokemon pokemon) {
        List<SimplePokemon> pokemonList = externalPokemonRepository.pegarTodosPokemons(0, 100);

        Collections.shuffle(pokemonList);

        SimplePokemon simplePokemonRandom = pokemonList.stream().findFirst().orElse(null);

        Pokemon pokemonRandomizado = buscarPokemonService.buscar(simplePokemonRandom.getName());

        pokemon.setVida(60* pokemon.getCurrentExperience());
        pokemonRandomizado.setVida(100* pokemon.getCurrentExperience());

        pokemon.setAtaque(10 * pokemon.getCurrentExperience());
        pokemonRandomizado.setAtaque(10 * pokemon.getCurrentExperience());

        while(pokemon.getVida()>0 && pokemonRandomizado.getVida()>0){
            pokemon.setVida(pokemon.getVida() - pokemonRandomizado.getAtaque());
            pokemonRandomizado.setVida(pokemonRandomizado.getVida() - pokemon.getAtaque());
        }

        if(pokemon.getVida()>0){
            resultado.setVencedor(true);
        }

        resultado.setNomeAdversario(pokemonRandomizado.getName());

        return resultado;
    }
}
