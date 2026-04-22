package org.example.jdbc_task.repository;

import org.example.jdbc_task.DbConfig;
import org.example.jdbc_task.model.Customer;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepositoryJdbc {
    //Optional<Customer> findById()
    // findALl()
    // Customer save(Customer customer) if id isPresent in database the update model else create new row
    //void delete (Integer custmerID)
    //PostContract-a connect to db Predestroy close connection


    public Optional<Customer> findById(Integer customerID) throws SQLException {
        PreparedStatement preparedStatement = DbConfig.connection.prepareStatement(
                "SELECT * FROM customer_task where customer_id = ?");
        preparedStatement.setInt(1, customerID);

        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            Customer customer = mapCustomer(rs);
            return Optional.of(customer);
        }
        return Optional.empty();

    }

    public List<Customer> findAll() throws SQLException {
        List<Customer> customers = new ArrayList<>();
        Statement statement = DbConfig.connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM customer_task");
        while (rs.next()) {
            customers.add(mapCustomer(rs));
        }
        return customers;
    }

    public boolean delete(Integer customerID) throws SQLException {
        PreparedStatement ps = DbConfig.connection.prepareStatement("DELETE FROM customer_task where customer_id = ?");
        ps.setInt(1, customerID);
        int count = ps.executeUpdate();
        return count >= 1;
    }

    public Customer mapCustomer(ResultSet rs) throws SQLException {
        Integer id = rs.getInt(1);
        String name = rs.getString(2);
        String surname = rs.getString(3);
        Integer age = rs.getInt(4);
        Customer customer = new Customer(id, name, surname, age);
        return customer;
    }

    public Customer save(Customer customer) throws SQLException {
        if (customer.getId() == null) {
            return insert(customer);
        } else {
            return update(customer);
        }
    }

    private Customer insert(Customer customer) throws SQLException {
        try (PreparedStatement ps = DbConfig.connection.prepareStatement(
                "INSERT INTO customer_task (name, surname, age) values (?, ?, ?)",
                Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getSurname());
            ps.setInt(3, customer.getAge());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                customer.setId(rs.getInt(1));
            }
            return customer;
        }
    }

    private Customer update(Customer customer) throws SQLException {
        try (PreparedStatement ps = DbConfig.connection.prepareStatement(
                "UPDATE customer_task SET name = ?, surname = ?, age =? WHERE customer_id = ?")) {
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getSurname());
            ps.setInt(3, customer.getAge());
            ps.setInt(4, customer.getId());

            ps.executeUpdate();
        }
        return customer;
    }

}


