package com.atividade.ads.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.ads.interfaces.IResource;
import com.atividade.ads.model.PessoaFisica;
import com.atividade.ads.services.PessoaFisicaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/pessoafisica")

public class PessoaFisicaResource implements IResource<PessoaFisica, Integer> {

    @Autowired
    private PessoaFisicaService service;

    @PostMapping(
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public PessoaFisica create(@Valid @RequestBody PessoaFisica entity) {
        return service.create(entity);
    }

    @GetMapping(
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public List<PessoaFisica> readAll() {
        return service.readAll();
    }

    @GetMapping(
        produces = {MediaType.APPLICATION_JSON_VALUE},
        value = "/{id}"
    )
    @Override
    public PessoaFisica read(@PathVariable Integer id) {
        return service.read(id);
    }

    @DeleteMapping(
        value = "/{id}"
    )
    @Override
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PatchMapping(
        value = "{/id}",
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public PessoaFisica updatePart(@PathVariable Integer id, @Valid @RequestBody PessoaFisica entity) {
        return service.updatePart(id, entity);
    }

    @PatchMapping(
        value = "{/id}",
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public PessoaFisica updateAll(@PathVariable Integer id, @Valid @RequestBody PessoaFisica entity) {
        return service.updateAll(id, entity);
    }

}
