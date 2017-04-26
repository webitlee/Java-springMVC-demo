package com.lyn.springmvc.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {
	@Resource
	private TestService ts;
	public TestController() {
		System.out.println("test Controller...");
	}
}
