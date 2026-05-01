package org.example.jdbc_task.controller;

import org.example.jdbc_task.model.Customer;
import org.example.jdbc_task.model.CustomerEntity;
import org.example.jdbc_task.service.CustomerServiceJdbc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/customers")
public class CustomerControllerJdbc {


    private CustomerServiceJdbc customerServiceJdbc;

    private static final Logger logger = LoggerFactory.getLogger(CustomerControllerJdbc.class);
    CustomerControllerJdbc(CustomerServiceJdbc customerServiceJdbc) {
        this.customerServiceJdbc = customerServiceJdbc;
    }


    @GetMapping("/{id}")
    public Customer findById(@PathVariable Integer id) throws SQLException {
        logger.info("GET customer by id: " + id);
        return customerServiceJdbc.findById(id);
    }

    @GetMapping
    public List<Customer> findAll() throws SQLException {
        logger.info("GET list of customers");
        return customerServiceJdbc.findAll();
    }

    @PostMapping
    public void save(@RequestBody Customer customer) throws SQLException {
        logger.info("POST add customer: " + customer);
         customerServiceJdbc.save(customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) throws SQLException {
        logger.info("DELETE delete customer by id: " + id);
       customerServiceJdbc.delete(id);
    }
    @PutMapping("/{id}")
            public void update (@RequestBody Customer customer, @PathVariable Integer id){

    }
}
