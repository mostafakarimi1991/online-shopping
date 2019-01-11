package com.onlineShopping.firstOnlineShoppingBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.onlineShopping.firstOnlineShoppingBackend.dao.CategoryDAO;
import com.onlineShopping.firstOnlineShoppingBackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	
	private static List<Category> categories=new ArrayList<>();
	
	static {
		Category category = new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDesc("Description of TV");
		category.setImgURL("CAT_01.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobail");
		category.setDesc("Description of Mobail");
		category.setImgURL("CAT_02.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDesc("Description of Laptop");
		category.setImgURL("CAT_03.png");
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list(){
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category : categories) {
			if(category.getId() == id) {
				return category;
			}
		}
		return null;
	}

}
