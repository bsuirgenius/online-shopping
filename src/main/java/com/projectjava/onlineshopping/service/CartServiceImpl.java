package com.projectjava.onlineshopping.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.projectjava.onlineshopping.model.Cart;
import com.projectjava.onlineshopping.model.UserModel;
import com.projectjava.onlineshopping.repository.CartRepository;

@Service("cartService")
public class CartServiceImpl implements CartService {

	@Qualifier("cartRepository")
	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private HttpSession httpSession;

	@Override
	public boolean saveCart(Cart cart) {
		// TODO Auto-generated method stub
		cartRepository.saveAndFlush(cart);
		return true;
	}

	@Override
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		cartRepository.saveAndFlush(cart);
		return true;
	}

	@Override
	public Cart findCart() {
		// TODO Auto-generated method stub
		return ((UserModel) httpSession.getAttribute("userModel")).getCart();
	}

}
