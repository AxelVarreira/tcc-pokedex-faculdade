package com.axel.joao.tcc.poo2.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;

    @Column(name = "idPokemon")
    private Integer idPokemon;

    @Column(name = "name")
    private String name;

    @Column(name = "order")
    private Integer order;

    @Column(name = "types")
    private String types;

    @Column(name = "weight")
    private Float weight;

    @Column(name = "height")
    private Float height;

    @Column(name = "frontSprite")
    private String frontSprite;

    @Column(name = "skills")
    private List<String> skills;

    @Column(name = "apelido")
    private String apelido;
}
