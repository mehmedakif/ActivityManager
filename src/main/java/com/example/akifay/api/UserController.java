package com.example.akifay.api;

import com.example.akifay.dto.UserDto;
import com.example.akifay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {this.userService = userService;}

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto)
    {
        UserDto resultUser = userService.createUser(userDto);
        return ResponseEntity.ok(resultUser);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<UserDto>> getUsers()
    {
        List<UserDto> resultUsers = userService.getUsers();
        return ResponseEntity.ok(resultUsers);
    }

    @GetMapping("/getByMail/{mail}")
    public ResponseEntity<UserDto> getUser(@PathVariable String mail)
    {
        UserDto resultUser = userService.getUser(mail);
        return ResponseEntity.ok(resultUser);
    }

}
