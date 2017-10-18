package ua.kpi.payments.model.entity;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class Client implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String login;
    private String password;
    @Singular private List<CreditCard> creditCards;

}
