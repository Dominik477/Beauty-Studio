package com.example.mgbeautystudio.repository;

import com.example.mgbeautystudio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
