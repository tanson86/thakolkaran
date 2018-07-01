package com.thakolkaran.repository;

import org.springframework.data.repository.CrudRepository;

import com.thakolkaran.model.entity.Payment;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {

}
