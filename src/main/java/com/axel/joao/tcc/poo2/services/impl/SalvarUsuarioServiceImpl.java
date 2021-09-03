package com.axel.joao.tcc.poo2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axel.joao.tcc.poo2.domain.Usuario;
import com.axel.joao.tcc.poo2.repository.UsuarioRepository;
import com.axel.joao.tcc.poo2.services.interfaces.SalvarUsuarioService;

@Service
public class SalvarUsuarioServiceImpl implements SalvarUsuarioService {

    @Autowired
    final private UsuarioRepository usuarioRepository;

    public SalvarUsuarioServiceImpl(final UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void salvar(final Usuario user) {
        usuarioRepository.save(user);
    }
}
