package com.cg.service;

import java.util.List;

import com.cg.bean.Cartitem;

public interface CartitemService {

	List<Cartitem> getCartProducts();
	
	List<Cartitem> deleteFromCart(Integer cartId);
}
