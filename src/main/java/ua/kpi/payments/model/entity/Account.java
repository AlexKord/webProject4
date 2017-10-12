package ua.kpi.payments.model.entity;

import java.io.Serializable;

public class Account implements Serializable {
    private int account_id;
    private double balance;
    private boolean isBlocked;
    private int cardNumber;


    public Account() {
    }

    public Account(int account_id, double balance, boolean isBlocked, int cardNumber) {
        this.account_id = account_id;
        this.balance = balance;
        this.isBlocked = isBlocked;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return account_id;
    }

    public void setId(int account_id) {
        this.account_id = account_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
