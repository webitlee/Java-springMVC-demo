package com.lyn.springmvc.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestExceptionHandlerExceptionResolver {
	
	//1.在@ExceptionHandler方法的入参中可以加入Exception类型的参数，该参数即对应发生的异常对象
	//2.@ExceptionHandler方法的入参中不能传入Map,若希望把异常信息传到页面上，需要使用ModelAndView作为返回值
	//3.@ExceptionHandler方法标记的异常有优先级的问题
	//4.@ControllerAdvice:如果在当前Handler中找不到@ExceptionHandler方法来处理当前方法出现的异常，则将去@ControllerAdvice标记的类中查找@ExceptionHandler标记的方法来处理异常.
	
	/*@ExceptionHandler({ArithmeticException.class})
	public ModelAndView handlerArithmeticException(Exception ex){
		System.out.println("异常啦" + ex.getMessage());
		String viewName = "error";
		ModelAndView modelAndView = new ModelAndView(viewName);
		modelAndView.addObject("exception", ex);
		return modelAndView;
	}*/
	
	@RequestMapping("/testExceptionHandlerExceptionResolver")
	public String testExceptionHandlerExceptionResolver(@RequestParam("id") Integer id){

		System.out.println(10/id);
		return "modelDataTest";
	}
}
