package com.thakolkaran.repository;

import org.springframework.data.repository.CrudRepository;

import com.thakolkaran.model.entity.User;

public interface UserRepository extends CrudRepository<User,Integer> {

}
