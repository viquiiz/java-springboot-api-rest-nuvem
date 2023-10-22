package me.dio.service;

import me.dio.java.model.User;

public interface UserService {
    User findById(Long id);     

    User create(User userToCreate);
}