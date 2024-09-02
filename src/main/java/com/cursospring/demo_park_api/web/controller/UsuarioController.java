package com.cursospring.demo_park_api.web.controller;

import com.cursospring.demo_park_api.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequiredArgsConstructor - Lombok - inj. dep. será realizada via método construtor
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    //injeção de dependências para service
    private final UsuarioService usuarioService;
}
