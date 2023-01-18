package com.dioproject.controller;

import com.dioproject.models.Customer;
import com.dioproject.service.CustomerService;
import com.dioproject.service.ServiceFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final ServiceFacade serviceFacade;

    @GetMapping
    public Iterable<Customer> getAllCustomers() {
        return serviceFacade.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") Long id) {
        return serviceFacade.getCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer) {
        return serviceFacade.saveCustomer(customer);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(
            @PathVariable("id") Long id,
            @RequestBody Customer customer) {
        return serviceFacade.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomerById(@PathVariable("id") Long id) {
        serviceFacade.deleteCustomer(id);
    }
}
