package com.lyn.springmvc.fileUpload;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class TestFileUpload {

	@RequestMapping("/testFileUpload")
	public String testFileUpload(@RequestParam("desc") String desc, @RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException{
		System.out.println(desc);
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getInputStream());
		 // 项目在容器中实际发布运行的根路径
		//File coyp = new File(request.getSession().getServletContext().getRealPath("/") + String.valueOf(System.currentTimeMillis()) + file.getOriginalFilename());
		//file.transferTo(coyp);
		return "modelDataTest";
	}
}
