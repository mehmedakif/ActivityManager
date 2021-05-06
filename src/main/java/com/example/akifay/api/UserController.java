package com.example.akifay.api;

import com.example.akifay.dto.UserDto;
import com.example.akifay.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController
{
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
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
    @GetMapping("/getById/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id") Long id)
    {
        UserDto resultUser = userService.getUser(id);
        return ResponseEntity.ok(resultUser);
    }
    @PutMapping("/edit/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long id,@RequestBody UserDto userDto)
    {
        UserDto resultUser = userService.updateUser(id, userDto);
        return ResponseEntity.ok(resultUser);
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable("id") Long id)
    {
        Boolean result = userService.deleteUser(id);
        return ResponseEntity.ok(result);
    }
}
