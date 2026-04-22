package org.example.jdbc_task.service;

import org.example.jdbc_task.exception.EntityNotFoundException;
import org.example.jdbc_task.exception.ValidationException;
import org.example.jdbc_task.model.Customer;
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

    private void validateAge(Customer customer) {
        if (customer.getAge() < 0 || customer.getAge() > 120) {
            throw new ValidationException("Illegal age format!");
        }
    }

    private void validateName(Customer customer) {
        if (customer.getName().isBlank() || customer.getSurname().isBlank()) {
            throw new ValidationException("Illegal string format!");
        }
    }

    private String normalizeName(String s) {
        return s.substring(0, 1).toUpperCase()
                + s.substring(1).toLowerCase();
    }

    public Customer save(Customer customer) throws SQLException {
        validateAge(customer);
        validateName(customer);
        customer.setName(normalizeName(customer.getName()));
        customer.setSurname(normalizeName(customer.getSurname()));
        return customerRepositoryJdbc.save(customer);
    }

    public List<Customer> findAll() throws SQLException {
        return customerRepositoryJdbc.findAll();
    }

    public void delete(Integer customerID) throws SQLException {
        if (!customerRepositoryJdbc.delete(customerID)) {
            throw new EntityNotFoundException("Customer with id: " + customerID + " not exist!");
        }
        customerRepositoryJdbc.delete(customerID);
    }

    public Optional<Customer> findById(Integer customerId) throws SQLException {
        return customerRepositoryJdbc.findById(customerId);
    }
}
