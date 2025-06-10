package com.ironhack.contentcreatorscatalog.content.repository;


import com.ironhack.contentcreatorscatalog.content.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {


    Optional<Content> findFirstByLink(String link);


    List<Content> findByCreatorProfile_Id(Long creatorId);
}