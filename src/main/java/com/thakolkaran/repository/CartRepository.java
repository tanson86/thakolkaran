package com.thakolkaran.repository;

import org.springframework.data.repository.CrudRepository;

import com.thakolkaran.model.entity.Cart;

public interface CartRepository extends CrudRepository<Cart,Integer> {

}
