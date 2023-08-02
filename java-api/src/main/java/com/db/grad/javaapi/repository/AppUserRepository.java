package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
}
