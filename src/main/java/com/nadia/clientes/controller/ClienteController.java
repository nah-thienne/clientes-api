package com.nadia.clientes.controller;

import com.nadia.clientes.entity.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClienteController {

    @GetMapping("/clientes/{nome}")
    public Cliente mostrarCliente(@PathVariable String nome){
        Cliente clienteUm = new Cliente();
        clienteUm.setNome(nome);

        return clienteUm;
    }
}
