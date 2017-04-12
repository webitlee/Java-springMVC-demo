package com.lyn.springmvc.requestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/springmvc")
@Controller
public class requestMappingTest {
	
	private static final String SUCCESS = "helloWorld";
	//RequestMapping除了修饰方法，还可以来修饰类
	//类定义处：提供初步的请求映射，相对于WEB应用的根目录
	//方法处：提供进一步的细分映射信息，相对于类定义处的URL。若类定义出未标注@RequestMapping,则方法处标记的URL相对于WEB应用的根目录。
	@RequestMapping("/requestMapping")
	public String requestMapping(){
		System.out.println("requestMapping");
		return SUCCESS;
	}
}
