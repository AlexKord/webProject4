package ua.kpi.payments.model.entity;

import lombok.*;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Account implements Serializable {
    private int account_id;
    private double balance;
    private boolean isBlocked;
    private int cardNumber;

}
