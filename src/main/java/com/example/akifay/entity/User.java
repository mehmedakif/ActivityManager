package com.example.akifay.entity;


import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "USERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntitiy
{
    @Getter @Setter
    @Column(name = "PHONE", length = 11, nullable = false, unique = true)
    @Id
    private Long userPhone;

    @Column(name = "NAME",length = 50,nullable = false)
    @Getter @Setter
    private String userFullName;

    @Column(name = "MAIL",length = 100)
    @Getter @Setter
    private String mailAddress;

    @Column(name = "PASSWORD")
    @Getter @Setter
    private String userPassword;

}
