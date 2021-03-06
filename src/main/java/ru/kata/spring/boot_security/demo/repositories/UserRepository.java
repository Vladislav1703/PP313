package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.Optional;

@Qualifier("UserRepository")
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmail (String email);

    Optional<User> findById(Long id);

    void deleteById(Long id);
}
