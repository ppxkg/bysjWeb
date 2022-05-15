package com.my.bysj.activity.dao;

import com.my.bysj.activity.domain.Bulletin;
import com.my.bysj.activity.domain.User;

import java.util.List;

public interface UserDao {

    User login(User user);

    int register(User user);

    List<Bulletin> getBulletin();

    int setBulletin(Bulletin bulletin);
}
