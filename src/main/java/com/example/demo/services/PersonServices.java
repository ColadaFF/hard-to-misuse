package com.example.demo.services;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServices {
    @Autowired
    private PersonRepository personRepository;

    public boolean createPerson(Person person) {
       return personRepository.insert(person);
    }
}
