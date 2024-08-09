package com.example.mgbeautystudio.factory;

import com.example.mgbeautystudio.model.Admin;
import com.example.mgbeautystudio.model.Client;
import com.example.mgbeautystudio.model.User;
import com.example.mgbeautystudio.repository.AdminRepository;
import com.example.mgbeautystudio.repository.ClientRepository;
import com.example.mgbeautystudio.request.RegistrationRequest;
import com.example.mgbeautystudio.service.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AdminFactory {
    private final AdminRepository adminRepository;
    private final UserAttributesMapper userAttributesMapper;

    public User createAdmin(RegistrationRequest request) {

        Admin admin = new Admin();
        userAttributesMapper.setCommonAttributes(request, admin);
        return adminRepository.save(admin);
    }
}
