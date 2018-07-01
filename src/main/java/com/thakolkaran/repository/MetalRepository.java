package com.thakolkaran.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.thakolkaran.model.entity.Metal;

public interface MetalRepository  extends CrudRepository<Metal,Integer>{

}
