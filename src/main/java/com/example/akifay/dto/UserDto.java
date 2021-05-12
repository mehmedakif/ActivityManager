package com.example.akifay.dto;

import lombok.*;


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
    private String username;
    @Getter @Setter
    private String getPassword;
}
