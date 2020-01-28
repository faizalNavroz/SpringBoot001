package com.example.demo3.entity;

public class Account {

    private int accountNumber;
    private Enum accountType;
    private Double accountBalance;

    public Account() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Enum getAccountType() {
        return accountType;
    }

    public void setAccountType(Enum accountType) {
        this.accountType = accountType;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
