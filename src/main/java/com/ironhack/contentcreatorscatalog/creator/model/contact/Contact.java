package com.ironhack.contentcreatorscatalog.creator.model.contact;

import com.ironhack.contentcreatorscatalog.creator.model.profile.CreatorProfile;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class Contact {//id,phone,country,email

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank
    @Column(nullable = false)
    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Invalid phone number format")
    private String phone;


    @NotBlank
    @Column(nullable = false)
    private String country;

    @NotBlank
    @Email
    private String email;

    public Contact(String phone, String country, String email) {
        this.phone = phone;
        this.country = country;
        this.email = email;
    }
}

