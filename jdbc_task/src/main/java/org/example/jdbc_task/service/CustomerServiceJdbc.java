package org.example.jdbc_task.service;

import org.example.jdbc_task.exception.EntityNotFoundException;
import org.example.jdbc_task.exception.ValidationException;
import org.example.jdbc_task.model.Customer;
import org.example.jdbc_task.model.CustomerEntity;
import org.example.jdbc_task.repository.CustomerRepositoryJdbc;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceJdbc {

    CustomerRepositoryJdbc customerRepositoryJdbc;

    CustomerServiceJdbc(CustomerRepositoryJdbc customerRepositoryJdbc) {
        this.customerRepositoryJdbc = customerRepositoryJdbc;
    }

    public Customer findById(Integer customerId) {
        CustomerEntity customerEntity = customerRepositoryJdbc.findById(customerId)
                .orElseThrow(() -> new RuntimeException("CUSTOMER_NOT_FOUND"));
        return new Customer(
                customerEntity.getId(), customerEntity.getName(), customerEntity.getSurname(), customerEntity.getAge());
    }

    public List<Customer> findAll() {
        List<Customer> customers = customerRepositoryJdbc.findAll()
                .stream()
                .map(entity -> new Customer(entity.getId(), entity.getName(), entity.getSurname(), entity.getAge()))
                .toList();
        return customers;
    }

    public void save (Customer customer){
        CustomerEntity customerEntity = new CustomerEntity(
                null, customer.getName(),customer.getSurname(), customer.getAge());
        customerRepositoryJdbc.save(customerEntity);
    }

    public void delete(Integer customerId){
        customerRepositoryJdbc.deleteById(customerId);
    }

    public void update(Customer customer, Integer customerId){
        CustomerEntity customerEntity = customerRepositoryJdbc.findById(customerId)
                .orElseThrow(()->new RuntimeException("Customer_not_found"));
        customerEntity.setName(customer.getName());
        customerEntity.setSurname(customer.getSurname());
        customerEntity.setAge(customer.getAge());
        customerRepositoryJdbc.save(customerEntity);

    }

}

