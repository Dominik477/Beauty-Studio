package com.example.mgbeautystudio.request;

import jakarta.persistence.Column;
import jakarta.persistence.Transient;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

@Data
public class RegistrationRequest {
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    @Column(name = "mobile")
    private String phoneNumber;
    @NaturalId
    private String email;
    private String password;
    private String userType;
    private boolean isEnabled;

    @Transient
    private String specialization;
}
