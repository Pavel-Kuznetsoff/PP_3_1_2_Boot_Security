package ru.kata.spring.boot_security.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> getAll();
    User getById(int id);
    void update(User user);
    void delete(int id);
    User findByUsername(String username);
}
