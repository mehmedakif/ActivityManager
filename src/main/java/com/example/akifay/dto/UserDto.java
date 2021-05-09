package com.example.akifay.dto;

import com.example.akifay.entity.User;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto
{
    @Getter @Setter
    private String userFullName;
    @Getter @Setter
    private Long userPhone;
    @Getter @Setter
    private String mailAddress;
}
