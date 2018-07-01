package com.thakolkaran.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.thakolkaran.model.entity.Metal;
import com.thakolkaran.repository.MetalRepository;

@Service
public class MetalService {
	
	@Autowired
	MetalRepository metalRepository;
	
	public List<Metal> getMetalTypes(){
		//List<Metal> metalList = new ArrayList<Metal>();
		//metalRepository.findAll().forEach(metalList::add);
		return  (List<Metal>)metalRepository.findAll();
		
		
	}
	
}
