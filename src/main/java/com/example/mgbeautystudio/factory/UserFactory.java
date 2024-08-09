package com.example.mgbeautystudio.factory;

import com.example.mgbeautystudio.model.User;
import com.example.mgbeautystudio.repository.UserRepository;
import com.example.mgbeautystudio.request.RegistrationRequest;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class UserFactory {

    private final UserRepository userRepository;
    private final CosmetologistFactory cosmetologistFactory;
    private final ClientFactory clientFactory;
    private final AdminFactory adminFactory;


    public User createUser(RegistrationRequest registrationRequest) {

        if(userRepository.existsByEmail(registrationRequest.getEmail())) {
            throw new RuntimeException("Email " + registrationRequest.getEmail()  + " already exist!");
        }
        switch (registrationRequest.getUserType()) {
            case "Cosmetologist" -> {
                return cosmetologistFactory.createCosmetologist(registrationRequest);
            }
            case "Client" -> {
                return clientFactory.createClient(registrationRequest);
            }
            case "Admin" -> {
                return adminFactory.createAdmin(registrationRequest);
            }
            default -> {
                return null;
            }
        }

    }
}
