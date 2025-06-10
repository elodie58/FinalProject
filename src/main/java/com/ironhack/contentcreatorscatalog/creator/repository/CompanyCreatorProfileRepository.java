package com.ironhack.contentcreatorscatalog.creator.repository;


import com.ironhack.contentcreatorscatalog.creator.model.profile.CompanyCreatorProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyCreatorProfileRepository extends JpaRepository<CompanyCreatorProfile, Long> {
}
