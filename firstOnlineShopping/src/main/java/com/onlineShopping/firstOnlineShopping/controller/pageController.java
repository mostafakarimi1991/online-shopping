package com.onlineShopping.firstOnlineShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pageController {
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Wellcome to spring Web MVC");
		return mv;
	}
	
	//*This is for test*//
	@RequestMapping(value="/test")
	public ModelAndView testParam(@RequestParam(value="greeting", required=false)String greeting) {
		if(greeting == null)
			greeting="Hello There";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		 return mv;
	}
	
	//*This is for test*//	
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView testPath(@PathVariable("greeting")String greeting) {
		if(greeting == null)
			greeting="Hello There";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		 return mv;
	}
}
