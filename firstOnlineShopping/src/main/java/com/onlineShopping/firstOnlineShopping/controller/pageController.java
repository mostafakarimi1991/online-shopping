package com.onlineShopping.firstOnlineShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlineShopping.firstOnlineShoppingBackend.dao.CategoryDAO;
import com.onlineShopping.firstOnlineShoppingBackend.dto.Category;



@Controller
public class pageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		//Passing category lists   categoryDAO.list()		
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickHome",true);
		mv.addObject("userClickAbout",false);
		mv.addObject("userClickContact",false);
		mv.addObject("userClickAllProducts",false);
		mv.addObject("userClickCategoryProducts",false);
		return mv;
	}
	
	@RequestMapping(value= {"/about"})
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickHome",false);
		mv.addObject("userClickAbout",true);
		mv.addObject("userClickContact",false);
		mv.addObject("userClickAllProducts",false);
		mv.addObject("userClickCategoryProducts",false);
		return mv;
	}
	
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickHome",false);
		mv.addObject("userClickAbout",false);
		mv.addObject("userClickContact",true);
		mv.addObject("userClickAllProducts",false);
		mv.addObject("userClickCategoryProducts",false);
		return mv;
	}
	
	@RequestMapping(value= {"/show/all/products"})
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All Products");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickHome",false);
		mv.addObject("userClickAbout",false);
		mv.addObject("userClickContact",false);
		mv.addObject("userClickAllProducts",true);
		mv.addObject("userClickCategoryProducts",false);
		return mv;
	}
	
	@RequestMapping(value= {"/show/all/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		Category category = null;
		category = categoryDAO.get(id);
		mv.addObject("title",category.getName());
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("category",category);
		mv.addObject("userClickCategoryProducts",true);
		mv.addObject("userClickHome",false);
		mv.addObject("userClickAbout",false);
		mv.addObject("userClickContact",false);
		mv.addObject("userClickAllProducts",false);
		return mv;
	}

}
