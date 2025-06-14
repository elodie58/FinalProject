package com.ironhack.contentcreatorscatalog.creator.model.profile;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IndividualCreatorProfile extends CreatorProfile {//id,description,contact,content,age

    @Min(value = 13, message = "Age must be at least 13")
    private int age;

}