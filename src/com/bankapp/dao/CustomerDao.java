package com.bankapp.dao;

import com.bankapp.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {

    void save(Customer customer);

    Optional<Customer> findById(String customerId);

    List<Customer> findAll();

    boolean existsById(String customerId);
}
