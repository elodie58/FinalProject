package com.ironhack.contentcreatorscatalog.content.controller;

import com.ironhack.contentcreatorscatalog.content.model.Content;
import com.ironhack.contentcreatorscatalog.content.service.ContentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/content")
@RequiredArgsConstructor
public class ContentController {

    private final ContentService contentService;

    @PostMapping
    public ResponseEntity<Content> createContent(@Valid @RequestBody Content content) {
        return new ResponseEntity<>(contentService.createContent(content), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Content>> getAllContents() {
        return new ResponseEntity<>(contentService.getAllContents(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Content> getContentById(@PathVariable Long id) {
        return new ResponseEntity<>(contentService.getContentById(id), HttpStatus.OK);
    }


    // DONT RUN THIS
    @GetMapping("/creator/{creatorId}")
    public ResponseEntity<List<Content>> getContentsByCreator(@PathVariable Long creatorId) {
        return new ResponseEntity<>(contentService.getContentsByCreatorId(creatorId), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContent(@PathVariable Long id) {
        contentService.deleteContent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}