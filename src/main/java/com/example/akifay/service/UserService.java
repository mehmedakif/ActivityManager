package com.example.akifay.service;

import com.example.akifay.dto.UserDto;

import java.util.List;

public interface UserService
{
    UserDto createUser(UserDto user);
    List<UserDto> getUsers();
    UserDto getUser(String username);
    UserDto updateUser(Long id, UserDto user);
    Boolean deleteUser(Long id);
    String getPassword();
}
