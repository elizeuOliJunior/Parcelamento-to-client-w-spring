package com.elizeu.awpag.domain.model;


import jakarta.persistence.*;
//import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//@Table(name = "tb_cliente")
@Entity
@Getter
@Setter
public class Cliente {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "nome")
    private String nome;
    private String email;

    @Column(name = "fone")
    private String telefone;

}
