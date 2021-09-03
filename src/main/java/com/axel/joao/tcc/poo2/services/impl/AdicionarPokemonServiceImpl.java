package com.axel.joao.tcc.poo2.services.impl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.axel.joao.tcc.poo2.domain.Pokedex;
import com.axel.joao.tcc.poo2.domain.Pokemon;
import com.axel.joao.tcc.poo2.repository.PokedexRepository;
import com.axel.joao.tcc.poo2.services.interfaces.AdicionarPokemonService;

@Service
public class AdicionarPokemonServiceImpl implements AdicionarPokemonService {

    final private PokedexRepository pokedexRepository;

    public AdicionarPokemonServiceImpl(final PokedexRepository pokedexRepository) {
        this.pokedexRepository = pokedexRepository;
    }

    @Override
    public void adicionar(Integer userId, Pokemon pokemon) {
        Pokedex pokedex = pokedexRepository.findPokedexByUserId(userId);

        Set<Pokemon> list = pokedex.getPokemonList();

        list.add(pokemon);

        pokedex.setPokemonList(list);

        pokedexRepository.save(pokedex);
    }
}
