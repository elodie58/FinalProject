package com.ironhack.contentcreatorscatalog.creator.model.contact;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyContact extends Contact {//companyName,companyRegistrationNumber

    @NotBlank
    @Column(nullable = false)
    private String companyName;

    @NotBlank
    @Column(nullable = false)
    private String companyRegistrationNumber;
}


