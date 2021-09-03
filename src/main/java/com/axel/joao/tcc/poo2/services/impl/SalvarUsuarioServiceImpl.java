package com.axel.joao.tcc.poo2.services.impl;

/*
 * Servico responsavel por salvar o usuario
 * */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axel.joao.tcc.poo2.domain.Usuario;
import com.axel.joao.tcc.poo2.repository.UsuarioRepository;
import com.axel.joao.tcc.poo2.services.interfaces.SalvarUsuarioService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
@AllArgsConstructor
public class SalvarUsuarioServiceImpl implements SalvarUsuarioService {

    @Autowired
    final private UsuarioRepository usuarioRepository;

    @Override
    public void salvar(final Usuario user) {
        usuarioRepository.save(user);
    }
}
