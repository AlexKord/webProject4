package ua.kpi.payments.model.entity;

import java.io.Serializable;

public class Payment implements Serializable {
    private int paymentId;
    private int accountId;
    private double sum;

    public Payment() {
    }

    public Payment(int paymentId, int accountId, double sum) {
        this.paymentId = paymentId;
        this.accountId = accountId;
        this.sum = sum;
    }                          

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
