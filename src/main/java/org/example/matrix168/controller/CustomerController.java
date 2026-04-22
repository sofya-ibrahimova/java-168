package org.example.matrix168.controller;

import jakarta.annotation.PostConstruct;
import org.example.matrix168.model.Customer;
import org.example.matrix168.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable String id) {
        logger.info("GET customer by id: " + id);
        Customer customer = customerRepository.getCustomerByID(id);
        return ResponseEntity.ok(customer);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping()
    public ResponseEntity<List<Customer>> getAllCustomers() {
        logger.info("GET list of customers");
        return ResponseEntity.ok(customerRepository.getCustomers());
    }

    @PostMapping()
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        logger.info("POST add customer: " + customer);
        Customer addedCustomer = customerRepository.addCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedCustomer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable String id) {
        logger.info("DELETE delete customer by id: " + id);
        customerRepository.deleteCustomer(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable String id, @RequestBody Customer customer) {
        logger.info("PUT update customer by id: " + id + " " + customer);
        Customer updatedCustomer = customerRepository.updateCustomer(id, customer);
        return ResponseEntity.ok(updatedCustomer);
    }
}
