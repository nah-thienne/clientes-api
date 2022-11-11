package com.nadia.clientes.controller;

import com.nadia.clientes.entity.Cliente;
import com.nadia.clientes.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private ClienteRepository clienteRepository;
    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/{id}")
    public Cliente mostrarCliente(@PathVariable Long id){
        return clienteRepository.findById(id).get();
    }

    @PostMapping
    public Cliente salvarCliente(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);

        return cliente;
    }
}
