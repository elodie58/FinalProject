package com.ironhack.contentcreatorscatalog.creator.service;

import com.ironhack.contentcreatorscatalog.creator.model.contact.PersonalContact;
import com.ironhack.contentcreatorscatalog.creator.repository.PersonalContactRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonalContactService {

    private final PersonalContactRepository repository;

    public List<PersonalContact> getAll() {
        return repository.findAll();
    }

    public PersonalContact getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Personal contact not found: " + id));
    }

    public PersonalContact create(PersonalContact contact) {
        return repository.save(contact);
    }

    public PersonalContact update(Long id, PersonalContact updated) {
        PersonalContact existing = getById(id);
        existing.setPhone(updated.getPhone());
        existing.setEmail(updated.getEmail());
        existing.setCountry(updated.getCountry());
        existing.setGender(updated.getGender());
        existing.setName(updated.getName());
        return repository.save(existing);
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Personal contact not found: " + id);
        }
        repository.deleteById(id);
    }
}