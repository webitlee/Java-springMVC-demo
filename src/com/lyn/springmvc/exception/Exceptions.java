package com.lyn.springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class Exceptions {
	
	@ExceptionHandler({ArithmeticException.class})
	public ModelAndView handlerArithmeticException(Exception ex){
		System.out.println("异常啦" + ex.getMessage());
		String viewName = "error";
		ModelAndView modelAndView = new ModelAndView(viewName);
		modelAndView.addObject("exception", ex);
		return modelAndView;
	}
	
}
