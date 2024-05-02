package com.example.labb2webservices.repository;

import com.example.labb2webservices.entity.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, Long> {

}
