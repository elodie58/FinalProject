package com.ironhack.contentcreatorscatalog.creator.service;

import com.ironhack.contentcreatorscatalog.creator.model.profile.CompanyCreatorProfile;
import com.ironhack.contentcreatorscatalog.creator.repository.CompanyCreatorProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyCreatorProfileService {

    private final CompanyCreatorProfileRepository repository;

    public CompanyCreatorProfile save(CompanyCreatorProfile profile) {
        return repository.save(profile);
    }
}
