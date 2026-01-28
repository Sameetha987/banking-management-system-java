package com.bankapp.model;

import java.time.LocalDateTime;

public class Transaction {

    private String transactionId;
    private String accountNumber;
    private String customerId;
    private String type;
    private double amount;
    private double balanceAfter;
    private String status;
    private LocalDateTime createdAt;

    public Transaction(String transactionId,
                       String accountNumber,
                       String customerId,
                       String type,
                       double amount,
                       double balanceAfter,
                       String status,
                       LocalDateTime createdAt) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
