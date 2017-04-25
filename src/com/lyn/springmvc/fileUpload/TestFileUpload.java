package com.lyn.springmvc.fileUpload;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class TestFileUpload {

	@RequestMapping("/testFileUpload")
	public String testFileUpload(@RequestParam("desc") String desc, @RequestParam("file") MultipartFile file) throws IOException{
		System.out.println(desc);
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getInputStream());
		return "modelDataTest";
	}
}
