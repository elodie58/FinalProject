package com.ironhack.contentcreatorscatalog.creator.controller;

import com.ironhack.contentcreatorscatalog.creator.model.contact.PersonalContact;
import com.ironhack.contentcreatorscatalog.creator.service.PersonalContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personal-contacts")
@RequiredArgsConstructor
public class PersonalContactController {

    private final PersonalContactService service;

    @GetMapping
    public List<PersonalContact> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public PersonalContact getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PersonalContact create(@Valid @RequestBody PersonalContact contact) {
        return service.create(contact);
    }

    @PutMapping("/{id}")
    public PersonalContact update(@PathVariable Long id, @Valid @RequestBody PersonalContact contact) {
        return service.update(id, contact);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
