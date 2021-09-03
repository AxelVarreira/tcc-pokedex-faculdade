package com.axel.joao.tcc.poo2.domain;

/*
*  Classe de dominio da Pokedex, onde contem todos os atributos que irao ser criados no banco de dados, alem de ser uma classe normal
* */

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pokedex")
@SequenceGenerator(name = "seq_pokedex", sequenceName = "seq_pokedex", allocationSize = 1)
public class Pokedex {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pokedex")
    long idPokedex;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private Usuario user;

    @Column(name = "pokemonList")
    @ElementCollection
    private List<Pokemon> pokemonList;
}
