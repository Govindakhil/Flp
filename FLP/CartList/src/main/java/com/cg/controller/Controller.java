package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Cartitem;
import com.cg.service.CartitemService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

	@Autowired
	private CartitemService cartitemService;
	
	@GetMapping("/cartitems")
	public List<Cartitem> getAllStudents() {
		return cartitemService.getCartProducts();
	}
	
	@DeleteMapping("/cartitems/{cartId}")
	public List<Cartitem> deleteStudent(@PathVariable Integer cartId) {
		return cartitemService.deleteFromCart(cartId);		
	}
	
}
