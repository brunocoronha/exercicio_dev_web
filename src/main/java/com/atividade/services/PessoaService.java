package com.atividade.ads.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividade.ads.interfaces.IService;
import com.atividade.ads.model.Pessoa;
import com.atividade.ads.repository.ContatoRepository;

@Service
public class PessoaService implements IService<Pessoa, Integer>{

    @Autowired
    private ContatoRepository repository;

    @Override
    public Pessoa create(Pessoa entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public List<Pessoa> readAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readAll'");
    }

    @Override
    public Pessoa read(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Pessoa updatePart(Integer id, Pessoa entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePart'");
    }

    @Override
    public Pessoa updateAll(Integer id, Pessoa entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAll'");
    }  

}
