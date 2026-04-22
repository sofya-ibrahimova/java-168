package org.example.matrix168.customers_db;

import org.example.matrix168.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomersList {

    public List<Customer> list = new ArrayList<>();

}
