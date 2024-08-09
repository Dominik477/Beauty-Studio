package com.example.mgbeautystudio.factory;


import com.example.mgbeautystudio.model.Cosmetologist;
import com.example.mgbeautystudio.model.User;
import com.example.mgbeautystudio.repository.CosmetologistRepository;
import com.example.mgbeautystudio.repository.UserRepository;
import com.example.mgbeautystudio.request.RegistrationRequest;
import com.example.mgbeautystudio.service.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CosmetologistFactory {

    private final CosmetologistRepository cosmetologistRepository;
    private final UserAttributesMapper userAttributesMapper;

    public User createCosmetologist(RegistrationRequest request) {

        Cosmetologist cosmetologist = new Cosmetologist();
        userAttributesMapper.setCommonAttributes(request, cosmetologist);
        cosmetologist.setSpecialization(request.getSpecialization());
        return cosmetologistRepository.save(cosmetologist);
    }
}
