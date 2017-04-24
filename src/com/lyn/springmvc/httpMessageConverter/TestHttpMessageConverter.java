package com.lyn.springmvc.httpMessageConverter;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestHttpMessageConverter {
	
	@ResponseBody
	@RequestMapping("/testResponseBody")
	public String testResponseBody(@RequestBody String body){
		System.out.println(body);
		return "test @ResponseBody" + new Date(); 
	}
}
