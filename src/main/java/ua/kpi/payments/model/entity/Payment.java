package ua.kpi.payments.model.entity;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Payment implements Serializable {
    private int paymentId;
    private int accountId;
    private double sum;
}
