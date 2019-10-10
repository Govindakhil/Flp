package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Cartitem;
import com.cg.dao.CartitemRepository;
@Service
public class CartitemserviceImpl implements CartitemService {

	@Autowired
	private CartitemRepository cartitemRepository;

	@Override
	public List<Cartitem> getCartProducts() {
		return cartitemRepository.findAll();
	}

	@Override
	public List<Cartitem> deleteFromCart(Integer cartId) {
		cartitemRepository.deleteById(cartId);
		return getCartProducts();
	}

}
