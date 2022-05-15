package com.my.bysj.activity.service.impl;

import com.my.bysj.activity.dao.UserDao;
import com.my.bysj.activity.domain.Bulletin;
import com.my.bysj.activity.domain.User;
import com.my.bysj.activity.service.UserService;
import com.my.bysj.util.SqlSessionUtil;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
    @Override
    public User login(User user) {
        User user1 = userDao.login(user);
        return user1;
    }

    @Override
    public int register(User user) {
        int status=userDao.register(user);
        return status;
    }

    @Override
    public List<Bulletin> getBulletin() {
        List<Bulletin> bulletins=userDao.getBulletin();
        return bulletins;
    }

    @Override
    public boolean setBulletin(Bulletin bulletin) {
        boolean flag=true;
        int count=userDao.setBulletin(bulletin);
        if(count==0){
            flag=false;
        }
        return flag;
    }

}
