package com.example.akifay.model;


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
    private Long phoneNumber;

    @Column(name = "NAME",length = 50,nullable = false)
    @Getter @Setter
    private String fullName;

    @Column(name = "MAIL",length = 100)
    @Getter @Setter
    private String username;

    @Column(name = "PASSWORD")
    @Getter @Setter
    private String password;

    @Column(name = "ROLE")
    @Getter @Setter
    private String role;

}
