package com.dioproject.service.implementations;

import com.dioproject.models.Customer;
import com.dioproject.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public Customer getCustomerById(Long id) {
        return null;
    }

    @Override
    public void saveCustomer(Customer customer) {

    }

    @Override
    public void updateCustomer(Long id, Customer customer) {

    }

    @Override
    public void deleteCustomerById(Long id) {

    }
}
