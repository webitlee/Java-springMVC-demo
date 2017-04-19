package com.lyn.springmvc.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewTest {
	
	@RequestMapping("/testView")
	public String testView(){
		System.out.println("test View");
		return "helloView";
	}
}
