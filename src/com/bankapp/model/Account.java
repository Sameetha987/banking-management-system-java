package com.bankapp.model;

import java.time.LocalDateTime;

public class Account {

    private String accountNumber;
    private String customerId;
    private String accountType;
    private double balance;
    private String status;
    private LocalDateTime createdAt;

    public Account(String accountNumber,
                   String customerId,
                   String accountType,
                   double balance,
                   String status,
                   LocalDateTime createdAt) {
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.accountType = accountType;
        this.balance = balance;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
