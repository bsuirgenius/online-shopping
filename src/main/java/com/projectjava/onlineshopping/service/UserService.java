package com.projectjava.onlineshopping.service;

import com.projectjava.onlineshopping.model.User;

public interface UserService {

	boolean saveUser(User user);

	User findUserByEmail(String email);

}
