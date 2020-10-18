package com.grupodot.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupodot.test.model.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}