package com.dioproject.service;

import com.dioproject.models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    void saveCustomer(Customer customer);
    void updateCustomer(Long id, Customer customer);
    void deleteCustomerById(Long id);
}
