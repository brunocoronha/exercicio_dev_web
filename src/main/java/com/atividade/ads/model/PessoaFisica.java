package com.atividade.ads.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Data
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "pessoa_fisica")
public class PessoaFisica extends BaseModel {

    @Column(name = "CPF", length = 11, nullable = false)
    private String cpf;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id", referencedColumnName = "id")
    private Pessoa pessoa;
}
