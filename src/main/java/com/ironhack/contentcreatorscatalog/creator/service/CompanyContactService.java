package com.ironhack.contentcreatorscatalog.creator.service;

import com.ironhack.contentcreatorscatalog.creator.model.contact.CompanyContact;
import com.ironhack.contentcreatorscatalog.creator.repository.CompanyContactRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyContactService {

    private final CompanyContactRepository repository;

    public List<CompanyContact> getAll() {
        return repository.findAll();
    }

    public CompanyContact getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Company contact not found: " + id));
    }

    public CompanyContact create(CompanyContact contact) {
        return repository.save(contact);
    }

    public CompanyContact update(Long id, CompanyContact updated) {
        CompanyContact existing = getById(id);
        existing.setPhone(updated.getPhone());
        existing.setEmail(updated.getEmail());
        existing.setCountry(updated.getCountry());
        existing.setCompanyName(updated.getCompanyName());
        existing.setCompanyRegistrationNumber(updated.getCompanyRegistrationNumber());
        return repository.save(existing);
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Company contact not found: " + id);
        }
        repository.deleteById(id);
    }
}
