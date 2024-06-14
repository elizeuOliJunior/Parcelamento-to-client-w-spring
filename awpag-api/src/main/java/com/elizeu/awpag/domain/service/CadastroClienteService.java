package com.elizeu.awpag.domain.service;

import com.elizeu.awpag.domain.model.Cliente;
import com.elizeu.awpag.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CadastroClienteService {

    private ClienteRepository clienteRepository;

//    @Autowired
//    public CadastroClienteService(ClienteRepository clienteRepository) {
//        this.clienteRepository = clienteRepository;
//    }

    @Transactional
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
