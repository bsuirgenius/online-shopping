package com.projectjava.onlineshopping.service;

import com.projectjava.onlineshopping.model.Cart;

public interface CartService {
	
	boolean saveCart(Cart cart);
	boolean updateCart(Cart cart);
	
	Cart findCart();

}
