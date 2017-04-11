package com.lyn.springmvc.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	//使用RequestMapping来映射请求的url
	//返回值通过视图解析器解析为实际的物理视图，对于InternalResourceViewResolver视图解析器，会做如下解析：
	//通过prefix + returnValue + suffix的方式得到实际的物理视图，然后做转发操作
	// /WEB-INF/views/helloWorld.jsp
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("HELLO WORLD");
		return "helloWorld";
	}
}
