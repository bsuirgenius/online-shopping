package com.projectjava.onlineshopping.repository;

import com.projectjava.onlineshopping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findUserByEmail(String email);

}
