package com.elizeu.awpag.domain.repository;

import com.elizeu.awpag.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente,Long>{

    List<Cliente> findByNome(String nome);
    List<Cliente> findByNomeContaining(String nome);
}
