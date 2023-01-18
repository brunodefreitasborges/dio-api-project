package com.dioproject.service;

import com.dioproject.models.Address;

public interface AddressService {

    Address getOrCreateAddress(String cep);
}
