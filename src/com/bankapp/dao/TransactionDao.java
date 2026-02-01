package com.bankapp.dao;

import com.bankapp.model.Transaction;
import java.util.List;

public interface TransactionDao {

    void save(Transaction transaction);

    List<Transaction> findByAccountNumber(String accountNumber);

    List<Transaction> findLastNByAccountNumber(String accountNumber, int limit);
}
