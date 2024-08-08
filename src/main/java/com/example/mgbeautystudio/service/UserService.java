package com.example.mgbeautystudio.service.user;

import com.example.mgbeautystudio.model.User;
import com.example.mgbeautystudio.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void add(User user) {
        userRepository.save(user);
    }
}
