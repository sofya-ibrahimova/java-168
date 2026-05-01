package org.example.jdbc_task.repository;

import org.example.jdbc_task.DbConfig;
import org.example.jdbc_task.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepositoryJdbc extends JpaRepository<CustomerEntity, Integer> {
    //Optional<Customer> findById()
    // findALl()
    // Customer save(Customer customer) if id isPresent in database the update model else create new row
    //void delete (Integer custmerID)
    //PostContract-a connect to db Predestroy close connection



}


