package com.example.mgbeautystudio.factory;

import com.example.mgbeautystudio.model.Client;
import com.example.mgbeautystudio.model.Cosmetologist;
import com.example.mgbeautystudio.model.User;
import com.example.mgbeautystudio.repository.ClientRepository;
import com.example.mgbeautystudio.repository.CosmetologistRepository;
import com.example.mgbeautystudio.request.RegistrationRequest;
import com.example.mgbeautystudio.service.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClientFactory {
    private final ClientRepository clientRepository;
    private final UserAttributesMapper userAttributesMapper;

    public User createClient(RegistrationRequest request) {

        Client client = new Client();
        userAttributesMapper.setCommonAttributes(request, client);
        return clientRepository.save(client);
    }
}
