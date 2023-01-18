package com.dioproject.service.implementations;

import com.dioproject.integration.ViaCepService;
import com.dioproject.models.Address;
import com.dioproject.models.AddressRepository;
import com.dioproject.models.Customer;
import com.dioproject.models.CustomerRepository;
import com.dioproject.service.AddressService;
import com.dioproject.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        Customer customerToUpdate = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setId(customerToUpdate.getId());
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }
}
