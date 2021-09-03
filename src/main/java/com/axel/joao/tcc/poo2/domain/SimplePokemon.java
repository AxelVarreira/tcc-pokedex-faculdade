package com.axel.joao.tcc.poo2.domain;

/*
 * Classe de dominio do SimplePokemon, nao vai pro banco de dados
 * */

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SimplePokemon {
    private String name;
    private String url;
}
