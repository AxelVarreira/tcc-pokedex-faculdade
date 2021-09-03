package com.axel.joao.tcc.poo2.domain;

/*
 *  Classe de dominio do Pokemon, onde contem todos os atributos que irao ser criados no banco de dados, alem de ser uma classe normal
 * */

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pokemon")
@SequenceGenerator(name = "seq_pokemon", sequenceName = "seq_pokemon", allocationSize = 1)
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pokemon")
    private Integer id;

    @Column(name = "idPokemon")
    private Integer idPokemon;

    @Column(name = "name")
    private String name;

    @Column(name = "baseExperience")
    private Integer baseExperience;

    @Column(name = "currentExperience")
    private Integer currentExperience;

    @Column(name = "types")
    private String types;

    @Column(name = "weight")
    private Float weight;

    @Column(name = "height")
    private Float height;

    @Column(name = "apelido")
    private String apelido;

    @Column(name = "vida")
    private Integer vida;

    @Column(name = "ataque")
    private Integer ataque;
}
