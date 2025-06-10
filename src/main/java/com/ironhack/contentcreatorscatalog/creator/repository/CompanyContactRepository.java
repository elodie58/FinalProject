package com.ironhack.contentcreatorscatalog.creator.repository;


import com.ironhack.contentcreatorscatalog.creator.model.contact.CompanyContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyContactRepository extends JpaRepository<CompanyContact, Long> {
}
