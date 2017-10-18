package ua.kpi.payments.model.entity;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class CreditCard implements Serializable {
    private int id;
    private int number;
    private int pin;
    private int accountId;
    private int cientId;

}
