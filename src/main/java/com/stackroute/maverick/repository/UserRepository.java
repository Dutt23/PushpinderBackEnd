package com.stackroute.maverick.repository;

import org.springframework.data.repository.CrudRepository;

import com.stackroute.maverick.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}