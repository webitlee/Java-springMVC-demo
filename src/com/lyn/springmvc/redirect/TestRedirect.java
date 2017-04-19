package com.lyn.springmvc.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestRedirect {
	
	@RequestMapping("/testRedirect")
	public String testRedirect(){
		System.out.println("test Redirect");
		return "redirect:/helloWoldTest.jsp";
	}
	
	@RequestMapping("/testForward")
	public String testForward(){
		System.out.println("test Forward");
		return "forward:/WEB-INF/views/helloWorld.jsp";
	}
}
