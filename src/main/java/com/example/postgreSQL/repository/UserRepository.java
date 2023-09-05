package com.example.postgreSQL.repository;

import com.example.postgreSQL.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
