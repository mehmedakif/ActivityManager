package com.example.akifay.repository;

import com.example.akifay.dto.UserDto;
import com.example.akifay.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
    UserDto findByMailAddress (String mailAddress);
}
