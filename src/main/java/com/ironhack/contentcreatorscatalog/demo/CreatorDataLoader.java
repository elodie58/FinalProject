package com.ironhack.contentcreatorscatalog.demo;


import com.ironhack.contentcreatorscatalog.content.model.Content;
import com.ironhack.contentcreatorscatalog.content.model.ContentType;
import com.ironhack.contentcreatorscatalog.content.model.Language;
import com.ironhack.contentcreatorscatalog.content.repository.ContentRepository;
import com.ironhack.contentcreatorscatalog.content.service.ContentService;
import com.ironhack.contentcreatorscatalog.creator.model.contact.*;
import com.ironhack.contentcreatorscatalog.creator.model.dto.PersonalContactDTO;
import com.ironhack.contentcreatorscatalog.creator.model.profile.IndividualCreatorProfile;
import com.ironhack.contentcreatorscatalog.creator.repository.ContactRepository;
import com.ironhack.contentcreatorscatalog.creator.repository.CreatorProfileRepository;
import com.ironhack.contentcreatorscatalog.creator.service.CreatorProfileService;
import com.ironhack.contentcreatorscatalog.creator.service.IndividualCreatorProfileService;
import com.ironhack.contentcreatorscatalog.creator.service.PersonalContactService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class CreatorDataLoader implements CommandLineRunner {

    private final IndividualCreatorProfileService individualCreatorProfileService;
    private final PersonalContactService personalContactService;
    private final ContentService contentService;




    @Override
    @Transactional
    public void run(String... args) {
/*
        var contactDTO = new PersonalContactDTO();
*/
       /* PersonalContact contact = new PersonalContact(
                "3131241231",
                "india",
                "india@gmail.com",
                new Name("sdaf", "dae", " ada"),
                Gender.MALE);

var pc = personalContactService.create(contact);



        IndividualCreatorProfile profile = new IndividualCreatorProfile();
        profile.setAge(30);
        profile.setDescription("I am an individual creator");
        profile.setContact(pc);

        individualCreatorProfileService.save(profile);

*/
        Content content = new Content();
        content.setTitle("How to be a great content creator");
        content.setPlatform("YouTube");
        content.setLink("https://youtube.com/testvideo");
        content.setType(ContentType.Video);
        content.setLanguage(Language.English);
        content.setDateOfRelease(LocalDate.now().minusDays(10));
        //content.setCreatorProfile(profile);

        contentService.createContent(content);




        System.out.println("All runs successfully");
    }
}