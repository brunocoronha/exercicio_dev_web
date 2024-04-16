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
import com.atividade.ads.model.Endereco;
import com.atividade.ads.services.EnderecoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;


@Slf4j
@RestController
@RequestMapping(value = "/api/v1/endereco")

public class EnderecoResource implements IResource<Endereco, Integer>{

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping(
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Endereco create(@Valid @RequestBody Endereco entity) {
        return enderecoService.create(entity);
    }

    @GetMapping(
        produces = {MediaType.APPLICATION_JSON_VALUE},
        value = "/{id}"
    )
    @Override
    public Endereco read(@PathVariable Integer id) {
        return enderecoService.read(id);
    }


    @GetMapping(
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public List<Endereco> readAll() {
        return enderecoService.readAll();
    }

    @PatchMapping(
        value = "/{id}",
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Endereco updatePart(@PathVariable Integer id, @Valid @RequestBody Endereco entity) {
        return enderecoService.updatePart(id, entity);
    }


    @PutMapping(
        value = "/{id}",
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Endereco updateAll(@PathVariable Integer id, @Valid @RequestBody Endereco entity) {
        return enderecoService.updateAll(id, entity);
    }

    @DeleteMapping(
        value = "/{id}"
    )
    @Override
    public void delete(@PathVariable Integer id) {
        enderecoService.delete(id);
    }

}
