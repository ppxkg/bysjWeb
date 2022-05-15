package com.my.bysj.activity.service;

import com.my.bysj.activity.domain.Person;

import java.util.List;

public interface personService {
    boolean savePerson(Person person);

    List<Person> getPerson();
}
