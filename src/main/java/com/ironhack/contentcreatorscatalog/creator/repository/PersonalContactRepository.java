package com.ironhack.contentcreatorscatalog.creator.repository;


import com.ironhack.contentcreatorscatalog.creator.model.contact.PersonalContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalContactRepository extends JpaRepository<PersonalContact, Long> {
}
