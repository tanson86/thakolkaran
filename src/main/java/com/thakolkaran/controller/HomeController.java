package com.thakolkaran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thakolkaran.model.entity.Metal;
import com.thakolkaran.model.entity.Season;
import com.thakolkaran.model.entity.Seasonwishmapping;
import com.thakolkaran.service.MetalService;

@Controller
public class HomeController extends BaseController{

	@GetMapping(path="/home") // Map ONLY GET Requests
	public @ResponseBody Season season () {
		//return metalService.getMetalTypes();
		return wishService.getCurrentSeason();
	}

}
