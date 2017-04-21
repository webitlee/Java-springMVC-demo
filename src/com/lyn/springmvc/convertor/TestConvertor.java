package com.lyn.springmvc.convertor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lyn.springmvc.entity.User;
@Controller
public class TestConvertor {

	@RequestMapping("/testConvertor")
	public String test(@RequestParam("user") User user){
		System.out.println(user);
		return "modelDataTest";
	}
}
