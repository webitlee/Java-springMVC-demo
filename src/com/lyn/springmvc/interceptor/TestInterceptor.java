package com.lyn.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor implements HandlerInterceptor{

	//该方法在渲染视图之后被调用
	//用于释放资源用
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("afterCompletion");
	}

	//该方法在目标方法执行之后，视图渲染之前被调用
	//可以对请求域中的属性或视图做修改
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("postHandle");
	}

	//该方法在目标方法执行前被调用，若返回值为ture，则继续调用后续的拦截器和目标方法。若为false，则不再调用后续的拦截器和目标方法 
	//可以考虑做权限，日志，事物等
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("preHandle");
		return true;
	}
	

}
