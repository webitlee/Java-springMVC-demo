package com.lyn.springmvc.modelData;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lyn.springmvc.entity.User;
//@SessionAttributes(value={"user"}, types={String.class})
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
	
//	由@ModelAttribute标记的方法，会在每个目标方法方法执行前被SpringMVC调用
	@ModelAttribute
	public void getUser(@RequestParam(value="id", required=false) Integer id, Map<String, Object> map){
		if(id != null){
			User user = new User();
			user.setId(1);
			user.setAge(20);
			user.setUsername("Black Lee");
			user.setPassword("123456");
			System.out.println("模拟从数据库读取id为1的记录：" + user);
			map.put("user", user);
		}
	}
	
	//运行流程：
	//1.执行@ModelAttribute注解修饰的方法：从数据库中取出对象，把对象放入到Map中。键为：user
	//2.SpringMVC从Map中取出User对象，并把表单的请求参数赋给该User对象的对应属性
	//3.SpringMVC把上述对象传入目标方法的参数中。
	//注：在@ModelAttribtue修饰的方法中，放入到Map时的键需要和目标方法入参类型的第一个字母小写的字符串一致
	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(User user){
		System.out.println("修改:" + user);
		return SUCCESS;
		
	}
}
