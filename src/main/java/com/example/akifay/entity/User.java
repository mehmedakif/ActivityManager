package com.example.akifay.entity;


import lombok.Data;
import javax.persistence.*;



@Entity
@Table(name = "USERS")
@Data
public class User extends BaseEntitiy
{

    @Column(name = "PHONE", length = 11, nullable = false, unique = true)
    @Id
    private Long userPhone;
    @Column(name = "NAME",length = 50,nullable = false)
    private String userFullName;
    @Column(name = "MAIL",length = 100)
    private String userMail;
    @Column(name = "PASSWORD")
    private String userPassword;

}
