package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public ModelAndView indexGet(ModelAndView mv) {
	mv.addObject("name","名前がここに入ります");
	mv.addObject("age","年齢がここに入ります");
	mv.addObject("height","身長がここに入ります");
	mv.addObject("birthplace","出身地がここに入ります");
	mv.setViewName("index");
	return mv;
	}
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public ModelAndView indexPost (ModelAndView mv,
	@RequestParam("nameVal")String name,
	@RequestParam("ageVal")String age,
	@RequestParam("heightVal")String height,
	@RequestParam("birthplaceVal")String birthplace)
	{
	mv.addObject("name",name);
	mv.addObject("age",age);
	mv.addObject("height",height);
	mv.addObject("birthplace",birthplace);
	mv.setViewName("index");
	return mv;
	}
	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public ModelAndView factorial(ModelAndView mv) {
	mv.addObject("number","階乗の計算をします。");
	
	mv.setViewName("Javaday20");
	
	return mv;
	}
	@RequestMapping(value="/test1",method=RequestMethod.POST)
	public ModelAndView  factorial(ModelAndView mv,
			@RequestParam("numberVal")int number)
			
	{
	int x=number;
	int result=1;

	for(int i=1;i<x;i++) {
		System.out.println(i+"*");
		result=i*result;
	}
	
		
	mv.addObject("number",number+"の階乗は"+result*x+"です。");
	mv.setViewName("Javaday20");
	return mv;
	}
}
