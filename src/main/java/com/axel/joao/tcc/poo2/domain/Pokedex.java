package com.axel.joao.tcc.poo2.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pokedex")
public class Pokedex {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long idPokedex;

    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @Column(name = "pokemonList")
    private Set<Pokemon> pokemonList = new HashSet<>();

    public long getIdPokedex() {
        return idPokedex;
    }

    public void setIdPokedex(final long idPokedex) {
        this.idPokedex = idPokedex;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(final Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(final Set<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
