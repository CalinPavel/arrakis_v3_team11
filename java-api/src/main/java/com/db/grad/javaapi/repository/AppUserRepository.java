package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.AppUser;
import com.db.grad.javaapi.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    @Query(nativeQuery = true, value = "select * from app_user where user_email_address like :user_email_address")
    List<AppUser> findEmailAddress(String user_email_address);
}
