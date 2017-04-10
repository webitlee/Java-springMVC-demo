package com.lyn.springmvc.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	//ʹ��RequestMapping��ӳ�������url
	//����ֵͨ����ͼ����������Ϊʵ�ʵ�������ͼ������InternalResourceViewResolver��ͼ���������������½�����
	//ͨ��prefix + returnValue + stuffix�ķ�ʽ�õ�ʵ�ʵ�������ͼ��Ȼ����ת������
	// /WEB-INF/views/helloWorld.jsp
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("HELLO WORLD");
		return "helloWorld";
	}
}
