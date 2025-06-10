package com.ironhack.contentcreatorscatalog.content.model;

import com.ironhack.contentcreatorscatalog.creator.model.profile.CreatorProfile;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Content {//id,title,platform,link,type,profile,language,dateOfRelease

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String platform;

    @URL
    @NotBlank
    private String link;

    @Enumerated(EnumType.STRING)
    @NotNull
    private ContentType type;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Language language;

    @PastOrPresent(message = "Release date must be in the past or today")
    @Column(nullable = false)
    private LocalDate dateOfRelease;


    @ManyToOne
    @JoinColumn(name = "creator_profile_id")
   private CreatorProfile creatorProfile;
}