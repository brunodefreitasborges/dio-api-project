package com.dioproject.integration;

import com.dioproject.models.Address;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepService {

    RestTemplate restTemplate = new RestTemplate();

    public Address getAddressByCep(String cep) {
        return restTemplate.getForObject("https://viacep.com.br/ws/" + cep + "/json", Address.class);
    }
}
