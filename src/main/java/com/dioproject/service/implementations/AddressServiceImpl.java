package com.dioproject.service.implementations;

import com.dioproject.integration.ViaCepService;
import com.dioproject.models.Address;
import com.dioproject.models.AddressRepository;
import com.dioproject.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final ViaCepService viaCepService;

    @Override
    public Address getOrCreateAddress(String cep) {
        return addressRepository.findById(cep)
                .orElse(addressRepository.save(viaCepService.getAddressByCep(cep)));
    }
}

