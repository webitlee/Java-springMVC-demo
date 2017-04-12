package com.lyn.springmvc.requestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	//使用method属性指定请求方式
	@RequestMapping(value="/requestMapping2", method=RequestMethod.POST)
	public String requestMapping2(){
		System.out.println("requestMapping2");
		return SUCCESS;
	}
	
	//@PathVariable可以映射URL中的占位符到目标方法的参数中
	@RequestMapping("/pathVariable/{id}")
	public String testPathVariable(@PathVariable("id") Integer id){
		System.out.println("pathVariable" + id);
		return SUCCESS;
	}
	
	//REST风格URL
	//新增： /order/ POST
	//获取： /order/1 GET
	//更新： /order/1 PUT
	//删除： /order/1 DELETE
	//如何发送PUTH和DELETE请求
	//1.配置HiddenHttpMethodFilter
	//2.需要发送POST请求
	//3.在发送POST请求时，携带一个隐藏域name="_method" value="DELETE/PUT"
	//在SpringMVC中如何得到id？
	//在目标方法中使用@PahtVariable注解
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.GET)
	public String testRestGet(@PathVariable("id") Integer id){
		System.out.println("test REST GET");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest", method=RequestMethod.POST)
	public String testRestPost(){
		System.out.println("test REST POST");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.PUT)
	public String testRestPut(@PathVariable("id") Integer id){
		System.out.println("test REST PUT");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.DELETE)
	public String testRestDelete(@PathVariable("id") Integer id){
		System.out.println("test REST DELETE");
		return SUCCESS;
	}
}
