package com.bankapp.model;
import java.time.LocalDateTime;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String mobile;
    private String pin;
    private String status;
    private LocalDateTime createdAt;

    public Customer (   String customerId,
                        String name,
                        String email,
                        String mobile,
                        String pin,
                        String status,
                        LocalDateTime createdAt) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.pin = pin;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getCustomerId(){
        return customerId;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getMobile(){
        return mobile;
    }

    public String getPin(){
        return pin;
    }

    public String getStatus(){
        return status;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
}
