package com.nexr.exam.democockroachdb.controller;

import com.nexr.exam.democockroachdb.entity.Customer;
import com.nexr.exam.democockroachdb.repo.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/init")
    public void initializeDb() {
        repository.save(new Customer("Dave"));
        repository.save(new Customer("Adam"));
        repository.save(new Customer("Boduru"));
    }

    @GetMapping("/customers")
    public Iterable<Customer> getCustomers() {
        return repository.findAll();
    }

}
