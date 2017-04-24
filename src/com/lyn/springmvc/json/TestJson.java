package com.lyn.springmvc.json;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.lyn.springmvc.entity.Address;


@Controller
public class TestJson {
	
	@ResponseBody
	@ResourceMapping("/testJson")
	public Map<String, Address> testJson(){
		Address address = new Address();
		address.setProvince("黑龙江");
		address.setCity("北京");
		Map<String, Address> map = new HashMap<String, Address>();
		map.put("address", address);
		return map;
	}
}
