package com.thakolkaran.repository;

import org.springframework.data.repository.CrudRepository;

import com.thakolkaran.model.entity.Category;

public interface CategoryRepository extends CrudRepository<Category,Integer> {

}
