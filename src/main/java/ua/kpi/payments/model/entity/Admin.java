package ua.kpi.payments.model.entity;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Admin implements Serializable {
    private int id;
    private String login;
    private String password;

}
