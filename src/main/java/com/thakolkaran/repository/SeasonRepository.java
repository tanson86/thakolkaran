package com.thakolkaran.repository;


import org.springframework.data.repository.CrudRepository;

import com.thakolkaran.model.entity.Cart;
import com.thakolkaran.model.entity.Season;
import com.thakolkaran.repository.custom.SeasonCustomRepository;

public interface SeasonRepository extends CrudRepository<Season,Integer>, SeasonCustomRepository{
	
}

