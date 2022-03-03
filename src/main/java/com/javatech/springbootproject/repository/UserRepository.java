package com.javatech.springbootproject.repository;

import com.javatech.springbootproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
