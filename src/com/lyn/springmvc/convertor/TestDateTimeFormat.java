package com.lyn.springmvc.convertor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyn.springmvc.entity.User;

@Controller
public class TestDateTimeFormat {
	@RequestMapping("/testDateTimeFormat")
	public String dataTimeFormat(User user){
		System.out.println(user);
		return "modelDataTest";
	}
}
