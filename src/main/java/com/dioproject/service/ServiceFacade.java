package com.dioproject.service;

import com.dioproject.models.Address;
import com.dioproject.models.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceFacade {

    private final AddressService addressService;
    private final CustomerService customerService;

    public Customer saveCustomer(Customer customer) {
        Address address = addressService.getOrCreateAddress(customer.getAddress().getCep());
        customer.setAddress(address);
        return customerService.saveCustomer(customer);
    }

    public Iterable<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    public Customer getCustomerById(Long id) {
        return customerService.getCustomerById(id);
    }

    public Customer updateCustomer(Long id, Customer customer) {
        Address address = addressService.getOrCreateAddress(customer.getAddress().getCep());
        customer.setAddress(address);
        return customerService.updateCustomer(id, customer);
    }

    public void deleteCustomer(Long id) {
        customerService.deleteCustomerById(id);
    }

}
