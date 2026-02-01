package com.bankapp.dao;

import com.bankapp.model.Account;
import java.util.List;
import java.util.Optional;

public interface AccountDao {

    void save(Account account);

    Optional<Account> findByAccountNumber(String accountNumber);

    List<Account> findByCustomerId(String customerId);

    void updateBalance(String accountNumber, double newBalance);

    void updateStatus(String accountNumber, String status);
}
