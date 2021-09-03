package com.axel.joao.tcc.poo2.services.impl;

/*
 * Servico responsavel por salvar o pokemon na pokedex do usuario
 * */

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.axel.joao.tcc.poo2.domain.Pokedex;
import com.axel.joao.tcc.poo2.domain.Pokemon;
import com.axel.joao.tcc.poo2.repository.PokedexRepository;
import com.axel.joao.tcc.poo2.services.interfaces.AdicionarPokemonService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
@AllArgsConstructor
public class AdicionarPokemonServiceImpl implements AdicionarPokemonService {

    final private PokedexRepository pokedexRepository;

    @Override
    public void adicionar(Integer userId, Pokemon pokemon) {
        Pokedex pokedex = pokedexRepository.findPokedexByUser(userId);

        List<Pokemon> list = pokedex.getPokemonList();

        list.add(pokemon);

        pokedex.setPokemonList(list);

        pokedexRepository.save(pokedex);
    }
}
