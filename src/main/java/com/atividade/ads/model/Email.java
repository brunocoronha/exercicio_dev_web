package com.atividade.ads.model;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "email")
public class Email extends BaseModel{

    @Column(name = "EMAIL", nullable = false)
    private String enderecoEmail;
    @Column(name = "DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;
    @Column(name = "DATA_FIM")
    private LocalDateTime dataFim;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name = "id_contato")
    private Contato contato;

}
