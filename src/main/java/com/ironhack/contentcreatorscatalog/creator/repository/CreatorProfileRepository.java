package com.ironhack.contentcreatorscatalog.creator.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.ironhack.contentcreatorscatalog.creator.model.profile.CreatorProfile;


public interface CreatorProfileRepository extends JpaRepository<CreatorProfile, Long> {
}
