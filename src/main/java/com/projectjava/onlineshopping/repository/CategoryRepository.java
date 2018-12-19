package com.projectjava.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projectjava.onlineshopping.model.Category;;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
