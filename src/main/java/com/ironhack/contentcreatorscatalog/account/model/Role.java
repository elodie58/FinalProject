package com.ironhack.contentcreatorscatalog.account.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//1,2,3,4,....

    private String name;//USER,ADMIN

    @ManyToMany(mappedBy = "roles", fetch = LAZY)
    @JsonIgnore
    private Collection<User> users = new ArrayList<>();

    public Role(String name) {
        this.name = name;
        this.users = new ArrayList<>();

    }
}
