package com.dela.versioning.controllers;

import com.dela.versioning.models.Name;
import com.dela.versioning.models.PersonV1;
import com.dela.versioning.models.PersonV2;
import com.dela.versioning.repositories.PersonV1Repository;
import com.dela.versioning.repositories.PersonV2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonV1Repository personV1Repository;

    @Autowired
    PersonV2Repository personV2Repository;

    @GetMapping(path = "/person", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getPersonV1() {
        return new PersonV1("Haris Delalic");
    }

    @GetMapping(path = "/person", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getPersonV2() {
        return new PersonV2(new Name("HarisV2", "DelalicV2"));
    }

    @PostMapping(path = "/v1/persons")
    public PersonV1 createPerson(@RequestBody PersonV1 personV1) {
        return personV1Repository.save(personV1);
    }

    @PostMapping(path = "/v2/persons")
    public PersonV2 createPerson(@RequestBody PersonV2 personV2) {
        return personV2Repository.save(personV2);
    }
}
