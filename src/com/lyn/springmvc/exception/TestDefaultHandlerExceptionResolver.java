package com.lyn.springmvc.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestDefaultHandlerExceptionResolver {

	@RequestMapping(value="/testDefaultHandlerExceptionResolver", method=RequestMethod.POST)
	public String testDefaultHandlerExceptionResolver(){
		System.out.println("test DefaultHandlerExceptionResolver");
		return "error";
	}
}
