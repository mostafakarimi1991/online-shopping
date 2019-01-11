package com.onlineShopping.firstOnlineShoppingBackend.dao;

import java.util.List;

import com.onlineShopping.firstOnlineShoppingBackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);

}
