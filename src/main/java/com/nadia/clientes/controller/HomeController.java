package com.nadia.clientes.controller;

import com.nadia.clientes.model.Mensagem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {
    @GetMapping
    public Mensagem welcome(){
        Mensagem mensagemOne = new Mensagem();
        mensagemOne.texto = "meu ok";
        return mensagemOne;
    }
}
