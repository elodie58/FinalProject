package com.ironhack.contentcreatorscatalog.creator.repository;

import com.ironhack.contentcreatorscatalog.creator.model.contact.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
