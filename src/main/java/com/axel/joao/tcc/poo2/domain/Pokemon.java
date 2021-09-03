package com.axel.joao.tcc.poo2.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;

    @Column(name = "idPokemon")
    @JsonProperty
    private Integer idPokemon;

    @Column(name = "name")
    private String name;

    @Column(name = "baseExperience")
    private Integer baseExperience;

    @Column(name = "currentExperience")
    private Integer currentExperience = this.baseExperience;

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
    @ElementCollection
    private List<String> skills;

    @Column(name = "apelido")
    private String apelido;

    private Integer vida;

    private Integer ataque;
}
