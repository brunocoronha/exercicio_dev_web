package com.atividade.ads.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "contato")
public class Contato extends BaseModel {

    @Column(name = "DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;
    
    @Column(name = "DATA_FIM", nullable = false)
    private LocalDateTime dataFim;    
    
    @ManyToOne(fetch = FetchType.LAZY)    
    @JoinColumn(name = "id_pessoa") 
    private Pessoa pessoa;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contato_id")
    private List<Email> emails = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contato_id")
    private List<Endereco> enderecos = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contato_id")
    private List<Telefone> telefones = new ArrayList<>();

}
