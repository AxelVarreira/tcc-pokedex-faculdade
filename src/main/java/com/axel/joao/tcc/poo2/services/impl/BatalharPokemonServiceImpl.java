package com.axel.joao.tcc.poo2.services.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.axel.joao.tcc.poo2.domain.Pokemon;
import com.axel.joao.tcc.poo2.domain.SimplePokemon;
import com.axel.joao.tcc.poo2.repository.ExternalPokemonRepository;
import com.axel.joao.tcc.poo2.services.interfaces.BatalharPokemonsService;
import com.axel.joao.tcc.poo2.services.interfaces.BuscarPokemonService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BatalharPokemonServiceImpl implements BatalharPokemonsService {

    @Autowired
    ExternalPokemonRepository externalPokemonRepository;

    @Autowired
    BuscarPokemonService buscarPokemonService;

    private Integer counter = 0;

    private boolean isVencedor;

    @Override
    public Boolean batalhar(Pokemon pokemon) {

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
            isVencedor = true;
        }

        return isVencedor;
    }
}
