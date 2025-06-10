package com.ironhack.contentcreatorscatalog.content.service;

import com.ironhack.contentcreatorscatalog.content.model.Content;
import com.ironhack.contentcreatorscatalog.content.repository.ContentRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContentService {

    private final ContentRepository contentRepository;

    public Content createContent(Content content) {
        return contentRepository.save(content);
    }

    public List<Content> getAllContents() {
        return contentRepository.findAll();
    }

    public Content getContentById(Long id) {
        return contentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Content not found with ID: " + id));
    }

    public List<Content> getContentsByCreatorId(Long creatorId) {
        return contentRepository.findByCreatorProfile_Id(creatorId);
    }

    public void deleteContent(Long id) {
        if (!contentRepository.existsById(id)) {
            throw new EntityNotFoundException("Content not found with ID: " + id);
        }
        contentRepository.deleteById(id);
    }
}