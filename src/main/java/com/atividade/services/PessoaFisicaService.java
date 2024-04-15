package com.atividade.ads.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividade.ads.interfaces.IService;
import com.atividade.ads.model.PessoaFisica;
import com.atividade.ads.repository.ContatoRepository;

@Service
public class PessoaFisicaService implements IService<PessoaFisica, Integer> {

    @Autowired
    private ContatoRepository repository;

    @Override
    public PessoaFisica create(PessoaFisica entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public List<PessoaFisica> readAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readAll'");
    }

    @Override
    public PessoaFisica read(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public PessoaFisica updatePart(Integer id, PessoaFisica entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePart'");
    }

    @Override
    public PessoaFisica updateAll(Integer id, PessoaFisica entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAll'");
    }

}
