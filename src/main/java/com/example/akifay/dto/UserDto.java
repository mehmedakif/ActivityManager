package com.example.akifay.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;

@Data
public class UserDto
{
    private String userFullName;
    private Long userPhone;
    private String userMail;
}
