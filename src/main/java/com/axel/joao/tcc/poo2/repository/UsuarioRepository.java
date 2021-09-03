package com.axel.joao.tcc.poo2.repository;

/*
 * Faz a comunicacao com a tabela do Usuario no banco de dados e utiliza o Spring boot como mediador
 * */

import org.springframework.data.repository.CrudRepository;

import com.axel.joao.tcc.poo2.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    @Override
    <S extends Usuario> S save(S s);
}
