package com.ironhack.contentcreatorscatalog.creator.model.profile;

import com.ironhack.contentcreatorscatalog.content.model.Content;
import com.ironhack.contentcreatorscatalog.creator.model.contact.Contact;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public abstract class CreatorProfile {//id,description,contact,content

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Description cannot be blank")
    @Size(max = 255, message = "Description must be under 255 characters")
    private String description;

    @OneToOne(optional = false,cascade = CascadeType.ALL)
    //@JoinColumn(name = "contact_id", referencedColumnName = "id", nullable = false)
    private Contact contact;

    @OneToMany(mappedBy = "creatorProfile", cascade = CascadeType.ALL)
    private List<Content> contents = new ArrayList<>();

}
