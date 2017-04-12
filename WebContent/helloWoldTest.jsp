<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/springMVC/hello">hello world</a>
	<br/>
	<a href="/springMVC/springmvc/requestMapping">test requestMapping</a>
	<br/>
	<!-- 这里是一个 get请求-->
	<a href="/springMVC/springmvc/requestMapping2">test requestMapping2</a>
	<form action="/springMVC/springmvc/requestMapping2" method="post">
		<input type="submit" value="提交"/>
	</form>
	<br/>
	<a href="/springMVC/springmvc/pathVariable/2222">test PathVariable</a>
	<br/>
	<a href="/springMVC/springmvc/testRest/1">test REST get</a>
	<br/>
	<form action="/springMVC/springmvc/testRest/1" method="post">
		<input type="submit" value="test REST post"/>
	</form>
	<br/>
	<form action="/springMVC/springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="DELETE"/>
		<input type="submit" value="test REST DELETE"/>
	</form>
	<br/>
	<form action="/springMVC/springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="PUT"/>
		<input type="submit" value="test REST PUT"/>
	</form>
</body>
</html>