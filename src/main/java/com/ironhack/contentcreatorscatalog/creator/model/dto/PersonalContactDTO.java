package com.ironhack.contentcreatorscatalog.creator.model.dto;


import com.ironhack.contentcreatorscatalog.creator.model.contact.Gender;
import com.ironhack.contentcreatorscatalog.creator.model.contact.Name;
import jakarta.persistence.Embedded;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonalContactDTO {

    @NotBlank
    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Invalid phone number format")
    private String phone;


    @NotBlank
    private String country;

    @NotBlank
    @Email
    private String email;

    @Embedded
    Name name;

    @Enumerated
    Gender gender;
}
