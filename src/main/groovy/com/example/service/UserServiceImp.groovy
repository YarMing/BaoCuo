package com.example.service

import com.example.dao.UserDao
import com.example.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImp implements UserService {

    @Autowired
    UserDao userDao

    @Override
    String insert(User user) {

        return null
    }
}