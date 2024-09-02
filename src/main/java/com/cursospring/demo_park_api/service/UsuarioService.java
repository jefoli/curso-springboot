package com.cursospring.demo_park_api.service;

import com.cursospring.demo_park_api.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/* anotacao lombok (@RequiredArgsConstructor) - cria um metodo construtor com a variavel usuarioRepository
na classe como método construtor - assim o spring faz a injeção de dependências via método construtor*/

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;


}
