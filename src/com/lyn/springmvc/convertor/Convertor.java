package com.lyn.springmvc.convertor;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.lyn.springmvc.entity.Address;
import com.lyn.springmvc.entity.User;
@Component
public class Convertor implements Converter<String, User> {
	
	public User convert(String source) {
		User user = null;
		if(source != null){
			String [] arr = source.split("-");
			System.out.println(arr.length);
			if(arr != null && arr.length == 5){
				user = new User();
				Address address = new Address();
				user.setUsername(arr[0]);
				user.setPassword(arr[1]);
				user.setAge(Integer.parseInt(arr[2]));
				address.setProvince(arr[3]);
				address.setCity(arr[4]);
				user.setAddress(address);
			}
		}
		return user;
	}
	
}
