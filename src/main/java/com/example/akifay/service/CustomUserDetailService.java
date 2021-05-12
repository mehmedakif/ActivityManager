package com.example.akifay.service;

import com.example.akifay.model.CustomUserDetails;
import com.example.akifay.model.User;
import com.example.akifay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(s);
        if(user == null)
        {
            throw new UsernameNotFoundException("User not found in DB");
        }
        return new CustomUserDetails(user);
    }
}
