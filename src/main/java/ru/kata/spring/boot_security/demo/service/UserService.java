package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

     void add(User user);
     List<User> getAll();
     User getById(int id);
     void update(User user);
     void delete(int id);
}
