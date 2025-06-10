package com.ironhack.contentcreatorscatalog.creator.controller;

import com.ironhack.contentcreatorscatalog.creator.model.contact.CompanyContact;
import com.ironhack.contentcreatorscatalog.creator.service.CompanyContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company-contacts")
@RequiredArgsConstructor
public class CompanyContactController {

    private final CompanyContactService service;

    @GetMapping
    public List<CompanyContact> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public CompanyContact getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CompanyContact create(@Valid @RequestBody CompanyContact contact) {
        return service.create(contact);
    }

    @PutMapping("/{id}")
    public CompanyContact update(@PathVariable Long id, @Valid @RequestBody CompanyContact contact) {
        return service.update(id, contact);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
