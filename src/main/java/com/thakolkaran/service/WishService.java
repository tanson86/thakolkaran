package com.thakolkaran.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thakolkaran.model.entity.Season;
import com.thakolkaran.model.entity.Seasonwishmapping;
import com.thakolkaran.repository.SeasonRepository;
import com.thakolkaran.service.utils.ServiceConstants;

@Service
public class WishService {
	
	@Autowired 
	private SeasonRepository seasonRepository;
	
	public Season getCurrentSeason(){
		Optional<Season> season = seasonRepository.getCurrentSeason();
		if(season.isPresent())
			return season.get();
		else{
			Season s = new Season();
			s.setName("Thakolkaran Online Store");
			s.setDescription("We are happy to see you here. Please take a look at all the beautiful collections we have");
			s.setFoldername("generic/");
			Set<Seasonwishmapping> set = new HashSet<Seasonwishmapping>();
			Seasonwishmapping swm = new Seasonwishmapping(null, "Bangles", null, true, null);
			swm.setImagename(ServiceConstants.SEASON_IMAGE_PATH_ROOT+s.getFoldername()+"bangle.png");
			set.add(swm);
			swm = new Seasonwishmapping(null, "Ear Rings", null, true, null);
			swm.setImagename(ServiceConstants.SEASON_IMAGE_PATH_ROOT+s.getFoldername()+"earring.png");
			set.add(swm);
			swm = new Seasonwishmapping(null, "Necklaces", null, true, null);
			swm.setImagename(ServiceConstants.SEASON_IMAGE_PATH_ROOT+s.getFoldername()+"necklace.png");
			set.add(swm);
			s.setSeasonwishmappings(set);
			return s;
		}
		
	}
}
