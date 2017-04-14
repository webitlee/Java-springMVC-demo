package com.lyn.springmvc.modelData;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lyn.springmvc.entity.User;
@SessionAttributes(value={"user"}, types={String.class})
//@SessionAttribute除了可以通过属性名指定需要放到会话中的属性外(实际上使用的是value属性值)，
//还可以通过模型属性的对象类型指定那些模型属性需要放到会话中(实际上使用的是types属性值)
//注：该注解只能放在类的上面
 @Controller
public class Test {

	private static final String SUCCESS = "modelDataTest";
	@RequestMapping("/testModelAndView")
	//目标方法的返回值可以是ModelAndView类型，其中可以包含视图和模型信息 
	//spring MVC会把ModelAndView的model中的数据放入到request域对象中
	public ModelAndView testModelAndView(){
		String viewName = SUCCESS;
		ModelAndView modelAndView = new ModelAndView(viewName);
		//添加模型数据到ModelAndView中
		modelAndView.addObject("time", new Date());
		return modelAndView;
	}
	
	@RequestMapping("/testMap")
	//目标方法可以添加Map（实际上也可以是Model类型或ModelMap类型）类型的参数 。
	public String testMap(Map<String, Object> map){
		map.put("name", Arrays.asList("tom", "lee", "lily"));
		return SUCCESS;
	}
	
	@RequestMapping("/testSessionAttribute")
	public String testSessionAttribute(Map<String, Object> map){
		User user = new User();
		user.setUsername("lee");
		user.setPassword("123");
		user.setAge(20);
		map.put("user", user);
		return SUCCESS;
	}
}
