package com.example.akifay.service.serviceImp;

import com.example.akifay.config.ObjectMapperUtils;
import com.example.akifay.dto.UserDto;
import com.example.akifay.model.User;
import com.example.akifay.repository.UserRepository;
import com.example.akifay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto)
    {
        User user = null;
        ObjectMapperUtils.map(userDto, user);
        assert user != null;
        userRepository.save(user);
        return userDto;
    }

    @Override
    public List<UserDto> getUsers()
    {
        List<UserDto> userList = null;
        var users = userRepository.findAll();
        return ObjectMapperUtils.mapAll(users, UserDto.class);
    }

    @Override
    public UserDto getUser(String username)
    {
        User user = userRepository.findByUsername(username);
        return ObjectMapperUtils.map(user, UserDto.class);
    }

    @Override
    public UserDto updateUser(Long id, UserDto user) {
        return null;
    }

    @Override
    public Boolean deleteUser(Long id) {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

}
