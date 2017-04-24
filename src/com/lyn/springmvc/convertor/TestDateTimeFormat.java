package com.lyn.springmvc.convertor;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyn.springmvc.entity.User;

@Controller
public class TestDateTimeFormat {
	@RequestMapping("/testDateTimeFormat")
	public String dataTimeFormat(@Valid User user, BindingResult result){
		if(result.hasErrors()){
			List<ObjectError> errorList = result.getAllErrors();
			for(ObjectError error : errorList){
				System.out.println(error.getDefaultMessage());
			}
		}
		System.out.println(user);
		return "modelDataTest";
	}
}
 