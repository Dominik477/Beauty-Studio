package com.example.mgbeautystudio.factory;

import com.example.mgbeautystudio.model.User;
import com.example.mgbeautystudio.request.RegistrationRequest;

public interface IUserFactory {
    public User createUser(RegistrationRequest registrationRequest);
}
