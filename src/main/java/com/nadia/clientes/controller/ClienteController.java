package com.nadia.clientes.controller;

import com.nadia.clientes.entity.Cliente;
import com.nadia.clientes.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private ClienteRepository clienteRepository;
    //construtor
    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    //método-comportamento

    @GetMapping
    public List<Cliente> listarClientes(){
        return (List<Cliente>) clienteRepository.findAll();
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
    @PutMapping("/{id}")
    public Cliente alterarCliente(@PathVariable Long id, @RequestBody Cliente cliente){
        cliente.setId(id);
        return clienteRepository.save(cliente);
    }
    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id){
        clienteRepository.deleteById(id);
    }
}
