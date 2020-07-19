package com.zengxy.wj.service;


import com.zengxy.wj.dao.UserDAO;
import com.zengxy.wj.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public boolean isExist(String username){
        User user =getByName(username);
        return null!=user;
    }

    private User getByName(String username) {
        return userDAO.findByUsername(username);
    }

    //通过用户名和密码查询并获得对象
    public User get(String username,String password){
        return userDAO.getByUsernameAndPassword(username,password);
    }

    public void add(User user){
        userDAO.save(user);
    }
}
