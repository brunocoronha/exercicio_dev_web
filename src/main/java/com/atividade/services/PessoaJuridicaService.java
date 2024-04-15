package com.atividade.ads.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividade.ads.interfaces.IService;
import com.atividade.ads.model.PessoaJuridica;
import com.atividade.ads.repository.ContatoRepository;

@Service
public class PessoaJuridicaService implements IService<PessoaJuridica, Integer>{

    @Autowired
    private ContatoRepository repository;
    
    @Override
    public PessoaJuridica create(PessoaJuridica entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public List<PessoaJuridica> readAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readAll'");
    }

    @Override
    public PessoaJuridica read(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public PessoaJuridica updatePart(Integer id, PessoaJuridica entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePart'");
    }

    @Override
    public PessoaJuridica updateAll(Integer id, PessoaJuridica entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAll'");
    }

}
