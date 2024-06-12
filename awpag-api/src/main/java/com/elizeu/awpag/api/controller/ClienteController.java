package com.elizeu.awpag.api.controller;

import com.elizeu.awpag.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        var cliente1 = new Cliente();
        cliente1.setId(1l);
        cliente1.setNome("Elizeu");
        cliente1.setEmail("elizeu@gmail.com");
        cliente1.setTelefone("111-222-333");

        var cliente2 = new Cliente();
        cliente2.setId(2l);
        cliente2.setNome("Heloisa");
        cliente2.setEmail("heloisa@gmail.com");
        cliente2.setTelefone("222-333-444");

        return Arrays.asList(cliente1,cliente2);
    }
}
