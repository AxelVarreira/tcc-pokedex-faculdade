package com.axel.joao.tcc.poo2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axel.joao.tcc.poo2.domain.Pokemon;
import com.axel.joao.tcc.poo2.repository.ExternalPokemonRepository;
import com.axel.joao.tcc.poo2.services.interfaces.BuscarPokemonService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
@AllArgsConstructor
public class BuscarPokemonServiceImpl implements BuscarPokemonService {

    @Autowired
    ExternalPokemonRepository externalPokemonRepository;

    @Override
    public Pokemon buscar(final String nome) {
        Pokemon pokemon = externalPokemonRepository.pegarPokemonPorNome(nome);
        return pokemon;
    }
}
