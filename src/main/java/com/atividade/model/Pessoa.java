package com.atividade.ads.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "pessoa")
public class Pessoa extends BaseModel {

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @Column(name = "DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "DATA_FIM", nullable = false)
    private LocalDateTime dataFim;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contato_id")
    private List<Contato> contatos;

    @OneToOne(mappedBy = "pessoa")
    private PessoaJuridica pj;

    @OneToOne(mappedBy = "pessoa")
    private PessoaFisica pf;
        
}
