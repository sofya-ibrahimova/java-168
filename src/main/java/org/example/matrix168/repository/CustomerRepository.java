package org.example.matrix168.repository;

import org.example.matrix168.customers_db.CustomersList;
import org.example.matrix168.exceptions.CustomerNotFoundException;
import org.example.matrix168.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    CustomersList customersList;
    private static int idCounter = 1;

    public CustomerRepository(CustomersList customersList) {
        this.customersList = customersList;
    }

    public Customer addCustomer(Customer customer) {
        customer.setId(String.valueOf(idCounter++));
        customersList.list.add(customer);
        return customer;
    }

    public List<Customer> getCustomers() {
        return customersList.list;
    }

    public Customer getCustomerByID(String id) {
        int index = getCustomerFromList(id);
        if (index == -1) {
            throw new CustomerNotFoundException("Customer with id " + id + " not found!");
        }
        return customersList.list.get(index);
    }

    public Customer updateCustomer(String id, Customer customer) {
        int index = getCustomerFromList(id);
        if (index == -1) {
            throw new CustomerNotFoundException("Customer with id " + id + " not found!");
        }
        customer.setId(String.valueOf(idCounter++));
        customersList.list.set(index, customer);
        return customer;
    }

    public void deleteCustomer(String id) {
        int index = getCustomerFromList(id);
        if (index == -1) {
            throw new CustomerNotFoundException("Customer with id " + id + " not found!");
        }
        customersList.list.remove(index);
    }

    private int getCustomerFromList(String id) {
        for (int i = 0; i < customersList.list.size(); i++) {
            if (customersList.list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
