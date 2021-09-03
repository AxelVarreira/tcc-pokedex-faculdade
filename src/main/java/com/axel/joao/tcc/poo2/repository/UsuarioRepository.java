package com.axel.joao.tcc.poo2.repository;

import org.springframework.data.repository.CrudRepository;

import com.axel.joao.tcc.poo2.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    @Override
    <S extends Usuario> S save(S s);
}
