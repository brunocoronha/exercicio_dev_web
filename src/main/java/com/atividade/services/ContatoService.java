package com.atividade.ads.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atividade.ads.interfaces.IService;
import com.atividade.ads.model.Contato;
import com.atividade.ads.repository.ContatoRepository;



@Service
public class ContatoService implements IService<Contato, Integer>{

    @Autowired
    private ContatoRepository repository;

    @Transactional(rollbackFor = Error.class)
    @Override
    public Contato create(Contato entity) {
        return repository.save(entity);
    }

    @Override
    public List<Contato> readAll() {
        return repository.findAll();
    }

    @Override
    public Contato read(Integer id) {
        return repository.getReferenceById(id);
    }


    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Contato updatePart(Integer id, Contato entity) {
        Contato contatoEncontrContato = this.read(id);
        if(contatoEncontrContato != null){
            entity.setId(contatoEncontrContato.getId());            
            return repository.save(entity);
        }
        return null;
    }

    @Override
    public Contato updateAll(Integer id, Contato entity) {
        Contato contatoEncontrContato = this.read(id);
        if(contatoEncontrContato != null){
            entity.setId(contatoEncontrContato.getId());            
            return repository.save(entity);
        }
        return null;
    }

}
