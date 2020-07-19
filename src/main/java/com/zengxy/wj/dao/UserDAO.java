package com.zengxy.wj.dao;

import com.zengxy.wj.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {

    User findByUsername(String username);
    User getByUsernameAndPassword(String username,String password);

}
