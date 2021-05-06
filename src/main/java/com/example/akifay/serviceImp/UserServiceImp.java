package com.example.akifay.serviceImp;

import com.example.akifay.dto.UserDto;
import com.example.akifay.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Override
    public UserDto createUser(UserDto user) {
        return null;
    }

    @Override
    public List<UserDto> getUsers() {
        return null;
    }

    @Override
    public UserDto getUser(Long id) {
        return null;
    }

    @Override
    public UserDto updateUser(Long id, UserDto user) {
        return null;
    }

    @Override
    public Boolean deleteUser(Long id) {
        return null;
    }
}
