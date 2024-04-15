package com.atividade.ads.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.ads.interfaces.IResource;
import com.atividade.ads.model.PessoaJuridica;
import com.atividade.ads.services.PessoaJuridicaService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/pessoajuridica")

public class PessoaJuridicaResource implements IResource<PessoaJuridica, Integer>{

    @Autowired
    private PessoaJuridicaService service;

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
