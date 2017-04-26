package com.lyn.springmvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.FORBIDDEN, reason="用户名与密码不匹配")
public class UserNameNotMatchPasswordException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3049303457923875419L;

}
