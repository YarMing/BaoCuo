package com.example.dao

import com.example.model.User

interface UserDao {
    int insert(User user)
}