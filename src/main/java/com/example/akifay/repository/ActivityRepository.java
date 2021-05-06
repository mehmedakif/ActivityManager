package com.example.akifay.repository;

import com.example.akifay.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends CrudRepository<User, Long> {
}
