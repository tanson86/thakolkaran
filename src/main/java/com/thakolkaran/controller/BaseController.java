package com.thakolkaran.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.thakolkaran.service.CartService;
import com.thakolkaran.service.CategoryService;
import com.thakolkaran.service.MetalService;
import com.thakolkaran.service.OrnamentService;
import com.thakolkaran.service.PaymentService;
import com.thakolkaran.service.UserService;
import com.thakolkaran.service.WishService;

public class BaseController {
	
	@Autowired
	protected MetalService metalService;
	
	@Autowired
	protected WishService wishService;
	
	@Autowired
	protected CartService cartService;
	
	@Autowired
	protected CategoryService categoryService;
	
	@Autowired
	protected OrnamentService ornamentService;
	
	@Autowired
	protected PaymentService paymentService;
	
	@Autowired
	protected UserService userService;

}
