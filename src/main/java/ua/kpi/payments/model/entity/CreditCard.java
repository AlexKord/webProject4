package ua.kpi.payments.model.entity;

import java.io.Serializable;

public class CreditCard implements Serializable {
    private int id;
    private int number;
    private int pin;
    private int accountId;
    private int cientId;

    public CreditCard() {
    }

    public CreditCard(int id, int number, int pin, Client client) {
        this.id = id;
        this.number = number;
        this.pin = pin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getCientId() {
        return cientId;
    }

    public void setCientId(int cientId) {
        this.cientId = cientId;
    }
}
