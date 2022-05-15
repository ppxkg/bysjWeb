package com.my.bysj.activity.service.impl;

import com.my.bysj.activity.dao.PersonDao;
import com.my.bysj.activity.domain.Person;
import com.my.bysj.activity.service.personService;
import com.my.bysj.util.SqlSessionUtil;

import java.util.List;

public class personServiceImpl implements personService {
    PersonDao personDao = SqlSessionUtil.getSqlSession().getMapper(PersonDao.class);

    @Override
    public boolean savePerson(Person person) {
        boolean flag=true;
        int count=personDao.savePerson(person);
        if(count!=1){
            flag=false;
        }
        return flag;
    }

    @Override
    public List<Person> getPerson() {
        List<Person> persons=personDao.getPerson();
        return persons;
    }
}
