package com.ironhack.contentcreatorscatalog.creator.model.contact;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Name {

    @NotBlank
    @Column(nullable = false)
    @Pattern(regexp = "^[\\p{L}\\p{M}\\s'-]{2,50}$", message = "First name must be valid")
    private String firstName;



    @Column(nullable = false)
    private String middleName="";

    @NotBlank
    @Pattern(regexp = "^[\\p{L}\\p{M}\\s'-]{2,50}$", message = "Last name must be valid")
    @Column(nullable = false)
    private String lastName;

}