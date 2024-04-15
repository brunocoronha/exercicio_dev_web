package com.atividade.ads.resources;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.atividade.ads.interfaces.IResource;
import com.atividade.ads.model.Contato;
import com.atividade.ads.services.ContatoService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/contatos")
public class ContatoResource implements IResource<Contato, Integer>{

    @Autowired
    private ContatoService service;

    @Override
    @PostMapping(
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Contato create(@Valid @RequestBody Contato entity) {
        return service.create(entity);
    }


    @Override
    @GetMapping(
        value = "/{id}",
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Contato read(@PathVariable Integer id) {
        return service.read(id);
    }

    @Override
    @GetMapping(
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<Contato> readAll() {
        return service.readAll();
    }

    @Override
    @PatchMapping(
        value = "/{id}",
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
        
    )
    public Contato updatePart(@PathVariable Integer id, @Valid @RequestBody Contato entity) {
        return service.updatePart(id, entity);
    }

    @Override
    @PutMapping(
        value = "/{id}",
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
        
    )
    public Contato updateAll(@PathVariable Integer id, @Valid @RequestBody Contato entity) {
        return service.updateAll(id, entity);
    }

    @Override
    @DeleteMapping(
        value = "/{id}"
    )
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    

}
