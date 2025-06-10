package com.ironhack.contentcreatorscatalog.creator.repository;


import com.ironhack.contentcreatorscatalog.creator.model.profile.IndividualCreatorProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividualCreatorProfileRepository extends JpaRepository<IndividualCreatorProfile, Long> {
}
