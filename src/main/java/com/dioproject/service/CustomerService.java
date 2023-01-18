package com.dioproject.service;

import com.dioproject.models.Customer;

public interface CustomerService {

    Iterable<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Long id, Customer customer);
    void deleteCustomerById(Long id);
}
