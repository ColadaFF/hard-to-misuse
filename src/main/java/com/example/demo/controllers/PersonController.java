package com.example.demo.controllers;

import com.example.demo.model.Person;
import com.example.demo.model.ShortString;
import com.example.demo.repository.PersonRepository;
import com.example.demo.services.PersonServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private PersonServices services;

    @PostMapping
    public boolean createPerson(@RequestBody Person person) {
        return services.createPerson(person);
    }
}
