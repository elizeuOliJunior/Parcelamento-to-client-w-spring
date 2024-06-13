package com.elizeu.awpag.api.controller;

import com.elizeu.awpag.domain.model.Cliente;
import com.elizeu.awpag.domain.repository.ClienteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@RestController
public class ClienteController {

    private final ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public List<Cliente> listar(){

        //return clienteRepository.findByNomeContainig("JO");
        //return clienteRepository.findByNome("JOAO");
        return clienteRepository.findAll();
    }
}
