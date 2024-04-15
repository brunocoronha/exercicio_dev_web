package com.atividade.ads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividade.ads.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer>{

}
