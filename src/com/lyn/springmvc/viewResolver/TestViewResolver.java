package com.lyn.springmvc.viewResolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestViewResolver {
	private final String SUCCESS = "viewResolver";
	
	@RequestMapping("/testViewResolver")
	public String testViewResolver(){
		System.out.println("视图解析器");
		return SUCCESS;
	}
}
