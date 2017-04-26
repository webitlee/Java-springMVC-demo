package com.lyn.springmvc.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestSimpleMappingExceptionResolver {

	@RequestMapping("/testSimpleMappingExceptionResolver")
	public String testSimpleMappingExceptionResolver(@RequestParam("id") Integer id){
		String[] arr = new String[10];
		System.out.println(arr[id]);
		return "modelDataTest";
	}
}
