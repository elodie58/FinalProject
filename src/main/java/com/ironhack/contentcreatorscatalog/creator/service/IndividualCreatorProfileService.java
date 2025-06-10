package com.ironhack.contentcreatorscatalog.creator.service;

import com.ironhack.contentcreatorscatalog.creator.model.profile.IndividualCreatorProfile;
import com.ironhack.contentcreatorscatalog.creator.repository.IndividualCreatorProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IndividualCreatorProfileService {

    private final IndividualCreatorProfileRepository repository;

    public IndividualCreatorProfile save(IndividualCreatorProfile profile) {
        return repository.save(profile);
    }
}