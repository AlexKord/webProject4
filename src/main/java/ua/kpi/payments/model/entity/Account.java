package ua.kpi.payments.model.entity;

import java.io.Serializable;

public class Account implements Serializable {
    private int id;
    private double balance;
    private boolean isBlocked;
    private int cardNumber;


    public Account() {
    }

    public Account(int id, double balance, boolean isBlocked, int cardNumber) {
        this.id = id;
        this.balance = balance;
        this.isBlocked = isBlocked;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
