package com.my.bysj.activity.dao;

import com.my.bysj.activity.domain.Person;

import java.util.List;

public interface PersonDao {
    int savePerson(Person person);

    List<Person> getPerson();
}
