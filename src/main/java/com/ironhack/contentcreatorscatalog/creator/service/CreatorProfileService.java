package com.ironhack.contentcreatorscatalog.creator.service;

import com.ironhack.contentcreatorscatalog.creator.model.profile.CreatorProfile;
import com.ironhack.contentcreatorscatalog.creator.repository.CreatorProfileRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreatorProfileService {

    private final CreatorProfileRepository repository;

    public List<CreatorProfile> getAllCreators() {
        return repository.findAll();
    }

    public CreatorProfile getCreatorById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Creator with ID " + id + " not found"));
    }

    public CreatorProfile createCreator(CreatorProfile creator) {
        return repository.save(creator);
    }

    public void deleteCreator(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Creator with ID " + id + " does not exist");
        }
        repository.deleteById(id);
    }
}
