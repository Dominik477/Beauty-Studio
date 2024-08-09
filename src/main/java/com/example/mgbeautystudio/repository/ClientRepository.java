package com.example.mgbeautystudio.repository;

import com.example.mgbeautystudio.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
