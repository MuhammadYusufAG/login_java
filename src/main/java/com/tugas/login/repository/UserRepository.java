package com.tugas.login.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tugas.login.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
