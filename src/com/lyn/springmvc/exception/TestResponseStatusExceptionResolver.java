package com.lyn.springmvc.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestResponseStatusExceptionResolver{

	@RequestMapping("/testResponseStatusExceptionResolver")
	public String testResponseStatusExceptionResolver(@RequestParam("id") Integer id){
		if(id == 10){
			throw new UserNameNotMatchPasswordException();
		}else{
			System.out.println("testResponseStatusExceptionResolver");
		}
		return "error";
	}
}
