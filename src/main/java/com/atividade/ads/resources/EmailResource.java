package com.atividade.ads.resources;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.ads.interfaces.IResource;
import com.atividade.ads.model.Email;
import com.atividade.ads.services.EmailService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



@Slf4j
@RestController
@RequestMapping(value = "/api/v1/email")

public class EmailResource implements IResource<Email, Integer> {

    @Autowired
    private EmailService emailService;

    @PostMapping(
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Email create(@Valid @RequestBody Email entity) {
        return emailService.create(entity);
    }
    

    @GetMapping(
        produces = {MediaType.APPLICATION_JSON_VALUE},
        value = "/{id}"
    )
    @Override
    public Email read(@PathVariable Integer id) {
        return emailService.read(id);
    }

    @GetMapping(
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public List<Email> readAll() {
        return emailService.readAll();
    }

    @PatchMapping(
        value = "{/id}",
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Email updatePart(@PathVariable Integer id, @Valid @RequestBody Email entity) {
        return emailService.updatePart(id, entity);
    }

    @PutMapping(
        value = "{/id}",
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Email updateAll(Integer id, Email entity) {
        return emailService.updateAll(id, entity);
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        emailService.delete(id);
    }

    

}
