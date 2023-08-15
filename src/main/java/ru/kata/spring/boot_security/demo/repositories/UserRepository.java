package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;

public interface UserRepository {

    void addUser(User user);

    List<User> findAllUsers();

    User findUserById(int id);

    void deleteUserById(int id);

    void updateUser(User user);
}
