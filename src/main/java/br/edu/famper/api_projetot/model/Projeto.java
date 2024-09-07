package br.edu.famper.api_projetot.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "produto")
@Data
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "produto_id")
    private Long codigo;

    @Column(name = "nome", length = 75)
    private String nome;

    @Column(name = "descricao", length = 150)
    private String descricao;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "data_fim")
    private Date dataFim;

}

