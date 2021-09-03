package com.axel.joao.tcc.poo2.services.interfaces;

/*
 * Classe responsavel pela separacao de responsabilidade no servico de adicao do pokemon a pokedex do usuario
 * */

import com.axel.joao.tcc.poo2.domain.Usuario;

public interface SalvarUsuarioService {
    void salvar(Usuario user);
}
