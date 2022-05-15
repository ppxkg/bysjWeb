package com.my.bysj.activity.service;

import com.my.bysj.activity.domain.Bulletin;
import com.my.bysj.activity.domain.User;

import java.util.List;

public interface UserService {
    User login(User user);

    int register(User user);

    List<Bulletin> getBulletin();

    boolean setBulletin(Bulletin bulletin);
}
