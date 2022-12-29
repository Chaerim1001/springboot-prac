package com.prac.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<TB_User, Long> {
    Optional<TB_User> findByEmail(String email);
}
