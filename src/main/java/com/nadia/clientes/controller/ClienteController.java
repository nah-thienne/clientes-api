package com.nadia.clientes.controller;

import com.nadia.clientes.entity.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping
    public Cliente mostrarCliente(@RequestParam String nome){
        Cliente clienteUm = new Cliente();
        clienteUm.setNome(nome);

        return clienteUm;
    }

    @PostMapping
    public Cliente salvarCliente(@RequestBody Cliente cliente){
        //Lógica para salvar no banco de dados

        return cliente;
    }
}
