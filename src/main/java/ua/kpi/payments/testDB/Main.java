package ua.kpi.payments.testDB;


import ua.kpi.payments.model.entity.Client;
import ua.kpi.payments.model.entity.CreditCard;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        List<CreditCard> creditCardList = new ArrayList<>();
        CreditCard creditCard = CreditCard.builder()
                .id(1)
                .number(123)
                .pin(321)
                .accountId(2121)
                .cientId(1)
                .build();

        creditCardList.add(creditCard);

        Client client = Client.builder().
                id(1)
                .firstName("first_name")
                .lastName("last_name")
                .email("email")
                .login("login")
                .password("password")
                .creditCards(creditCardList)
                .build();
        System.out.println(client);
    }
}
