package ua.kpi.payments.model.entity;

import java.io.Serializable;
import java.util.List;

public class Client implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private List<CreditCard> creditCards;


    public Client() {
    }

    public Client(int id, String firstName, String lastName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public Client(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void makePayment() {}

    public void topUpBalance() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

}
